import java.util.*;

public class IsUnique 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		String input = s1.nextLine();
		System.out.println(IsUnique(input));
	}
	
	public static boolean IsUnique(String input)
	{
		int[] ascii = new int[256];
		
		//Initialize all elements in the ascii array to 0
		for(int i = 0; i < ascii.length; i++)
		{
			ascii[i] = 0;
		}
		
		// Convert each individual characters in given string to ascii values and store in array
		for(int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			ascii[(int) c] = ascii[(int) c] + 1;
		}
		
		// Do one last loop on the array to find if there are more than 1 of each character
		for(int i = 0; i < ascii.length; i++)
		{
			if(ascii[i] > 1)
			{
				return false;
			}
		}
		
		// Return true if all characters in the given string are unique
		return true;
	}
}
