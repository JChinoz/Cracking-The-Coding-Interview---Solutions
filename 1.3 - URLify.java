import java.util.*;

class URLify 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		String input1 = s1.nextLine();
		System.out.println(URLify(input1));
	}
	
	public static char[] URLify(String input)
	{
		input =  input.trim();
		char[] trimmed = input.toCharArray();
		int spacecount = 0;
		
		for(int i = 0; i < trimmed.length; i++)
		{
			if(trimmed[i] == ' ')
			{
				spacecount++;
			}
		}
		
		char[] modifiedTrimmed = new char[trimmed.length + spacecount * 2];
		int count = 0;
		for(int i = 0; i < trimmed.length; i++)
		{
			if(trimmed[i] == ' ')
			{
				modifiedTrimmed[i + count] = '%';
				modifiedTrimmed[i + count + 1] = '2';
				modifiedTrimmed[i + count + 2] = '0';
				count = count + 2;
			}
			
			else
			{
				modifiedTrimmed[i + count] = trimmed[i];
			}
		}
		
		return modifiedTrimmed;
	}
}
