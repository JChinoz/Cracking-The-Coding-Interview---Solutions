import java.util.*;

public class StringRotation 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		String input1 = s1.nextLine();
		String input2 = s1.nextLine();
		System.out.println(isSubstring(input1,input2));
	}
	
	public static boolean isSubstring(String input1, String input2)
	{
		// If both given strings are the same, then there is no rotation
		if(input1.compareTo(input2) == 0)
		{
			return true;
		}
		
		// If given strings are different, first check to see if the given string is REALLY a substring
		char[] charArray1 = input1.toCharArray();
		char[] charArray2 = input2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		String sortedString1 = new String(charArray1);
		String sortedString2 = new String(charArray2);
			
		if(sortedString1.compareTo(sortedString2) == 0)
		{
			// If the strings are identical after sorting, then it is a substring
			StringBuilder strbuild1 = new StringBuilder(input1);
			
			// Number of loops to be performed is equal to the length of the string
			for(int i = 0; i < strbuild1.length(); i++)
			{
				if(strbuild1.toString().compareTo(input2) == 0)
				{
					return true;
				}
				
				else
				{
					// With each iteration, the first letter will be placed at the back of the string, 
					// thus creating some sort of rotation of each characters in the word
					strbuild1.append(strbuild1.charAt(0));
					strbuild1.deleteCharAt(0);
				}
			}
		}
		return false;
	}
}
