import java.util.*;

class PalindromePermutation 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		String input = s1.nextLine();
		System.out.println(PalindromePermutation(input));
	}
	
	public static boolean PalindromePermutation(String input)
	{	
		int[] ascii = new int[256];
		int oddcount = 0;
		// Initialize ascii array into 0
		for(int i = 0; i < ascii.length; i++)
		{
			ascii[i] = 0;
		}
		
		// Convert words into positions into ascii character
		for(int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			ascii[(int) c] = ascii[(int) c] + 1;
		}
		
		// For a string to be considered a palindrome, there must only be one odd number of characters or none
		for(int i = 0; i < ascii.length; i++)
		{
			if(ascii[i] % 2 == 1)
			{
				oddcount = oddcount + 1;
			}
		}
		
		if(oddcount <= 1)
		{
			return true;
		}
		
		return false;
	
	}
}
