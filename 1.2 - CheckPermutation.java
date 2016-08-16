import java.util.*;
public class CheckPermutation 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		String input1 = s1.nextLine();
		String input2 = s1.nextLine();
		System.out.println(checkPermutation(input1, input2));
	}
	
	public static int checkPermutation(String input1, String input2)
	{
		char[] content1 = input1.toCharArray();
		char[] content2 = input2.toCharArray();
			
		Arrays.sort(content1);
		Arrays.sort(content2);
			
		for(int i = 0; i < content1.length; i++)
		{
			if(content1[i] != content2[i])
			{
				return -1;
			}	
		}
		
		if(input1.length() != input2.length())
		{
			return -1;
		}
		return 0;
	}

}
