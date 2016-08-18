import java.util.*;

public class ReturnKthtoLast 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		int k = s1.nextInt();
		LinkedList unsorted = new LinkedList();
		unsorted.add("F");
		unsorted.add("B");
		unsorted.add("D");
		unsorted.add("E");
		unsorted.add("A");
		unsorted.add("C");
		unsorted.add("E");
		unsorted.addFirst("E");
		unsorted.addLast("A");
		System.out.println(unsorted);
		System.out.println(ReturnKthtoLast(unsorted, k));
	}
	
	public static LinkedList ReturnKthtoLast(LinkedList unsorted, int k)
	{
		for(int i = 0; i < unsorted.size() - k; i++)
		{
			unsorted.removeFirst();
		}
		return unsorted;
	}
}
