import java.util.*;

public class OneAway 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		String input1 = s1.nextLine();
		String input2 = s1.nextLine();
		System.out.println(OneAway(input1, input2));
	}
	
	public static boolean OneAway(String input1, String input2)
	{
		// Initialize the length and assume that the length of two strings are equal
		int shortestlength = input1.length();
		int changedchar = 0;
		
		// Check and see if the character changes in the string is exactly -1, +1 or 0 character changes
		int sumlength = input1.length() - input2.length();
		if(sumlength == 0 || sumlength == 1 || sumlength == -1)
		{
			// Do comparisons to find out how many times to loop. Use shortest length of the two words to prevent out of bounds 
			if(input1.length() > input2.length())
			{
				shortestlength = input2.length();
			}
			
			else if(input1.length() < input2.length())
			{
				shortestlength = input1.length();
			}
			
			// Now looping the shortest length among the two. Do character by character comparisons to find out differences
			for(int i = 0; i < shortestlength; i++)
			{
				if(input2.contains("" + input1.charAt(i)))
				{
					
				}
				
				else
				{
					changedchar = changedchar + 1;
				}
				
				if(changedchar > 1)
				{
					return false;
				}
			}
			return true;
		}	
		else
		{
			return false;
		}
	}
}
