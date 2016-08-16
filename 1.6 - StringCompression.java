import java.util.*;

public class StringCompression 
{
	public static void main(String[] args)
	{
		Scanner s1 =  new Scanner(System.in);
		String input = s1.nextLine();
		System.out.println(StringCompression(input));
	}
	
	public static ArrayList<String> StringCompression(String input)
	{
		// Because we don't know what we're given and what we're gonna give back, use an ArrayList
		ArrayList<String> formedString = new ArrayList<String>();
		
		// Initialize 2 pointers, one for last character and one for current one
		char currentchar;
		char lastchar;
		int count = 1;
	
		lastchar = input.charAt(0);
		
		// Starting from the second character, check if the current position (2nd char) is different from the first
		for(int i = 1; i < input.length(); i++)
		{
			currentchar = input.charAt(i);
			// If it is the same, increment counter
			if(currentchar == lastchar)
			{
				count = count + 1;
			}
			
			// If it is different, append both the last character before it was different and the number of occurrence into ArrayList
			else
			{
				formedString.add("" + lastchar);
				formedString.add("" + count);
				count = 0;
				count = count + 1;
			}
			lastchar = input.charAt(i);
			
			// If it reaches the end, append the last known character and count. -1 to offset our loop starting at +1
			if(i == input.length() - 1)
			{
				formedString.add("" + lastchar);
				formedString.add("" + count);
			}
		}
		
		return formedString;
	}
}
