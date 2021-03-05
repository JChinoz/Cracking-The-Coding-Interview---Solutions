import java.util.*;

class RemoveDups 
{
	public static void main(String[] args)
	{
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
	
		System.out.println(RemoveDups(unsorted));
	}
	
	public static LinkedList RemoveDups(LinkedList unsorted)
	{
		Object word;
		int indexfirst;
		int indexlast;
		
		// Instantiate number of loops equal to number of elements in the given linked list
		for(int i = 0; i < unsorted.size(); i++)
		{
			// Get the first object of the list
			word = unsorted.get(i);
			// Get the first index occurence of the object
			indexfirst = unsorted.indexOf(word);
			// Get the last index occurence of the object
			indexlast = unsorted.lastIndexOf(word);
			
			// If the first occurence of the word is not the last (IE: is not singular), remove the last found object iteratively
			while(indexfirst != indexlast)
			{
				unsorted.remove(indexlast);
				indexlast = unsorted.lastIndexOf(word);
			}
		}
		return unsorted;
	}
}
