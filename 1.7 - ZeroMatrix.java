import java.util.*;

class ZeroMatrix 
{
	public static void main(String[] args)
	{
		// Dummy data to show that it works
		int[][] matrixInput = new int[][]{
				{ 2, 4, 3, 1 },
				{ 3, 1, 2, 1 },
				{ 1, 4, 1, 3 },
				{ 1, 2, 4, 1 },
				{ 1, 0, 1, 0 }
		};
		
		matrixInput = ZeroMatrix(matrixInput);
		
		for(int i = 0; i < matrixInput.length; i++)
		{
			for(int j = 0; j < matrixInput[i].length; j++)
			{
				System.out.print("" + matrixInput[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] ZeroMatrix(int[][] matrixInput)
	{
		// Using an array list because we don't know how many zero points are there gonna be
		Stack<Integer> pointx = new Stack<Integer>();
		Stack<Integer> pointy = new Stack<Integer>();
		
		// For each row
		for(int i = 0; i < matrixInput.length; i++)
		{
			// For each column
			for(int j = 0; j < matrixInput[i].length; j++)
			{
				// If there is a zero element, store in array list
				if(matrixInput[i][j] == 0)
				{
					pointx.push(i);
					pointy.push(j);
				}
			}
		}

		// If there is still values in Stack...
		while(pointx.size() > 0)
		{
			// Instantiate all row elements to 0
			for(int i = 0; i < matrixInput[i].length; i++)
			{
				System.out.println("I:" + i);
				matrixInput[pointx.peek()][i] = 0;
			}
			
			// Instantiate all column elements to 0
			for(int j = 0; j < matrixInput.length; j++)
			{
				System.out.println("J: " + j);
				matrixInput[j][pointy.peek()] = 0;
			}
			pointx.pop();
			pointy.pop();
		}
		
		return matrixInput;
	}
	
//	public static int[][] ZeroMatrix(int[][] matrixInput)
//	{
//		// For each row
//		for(int i = 0; i < matrixInput.length; i++)
//		{
//			System.out.println("i: " + i);
//			// For each column
//			for(int j = 0; j < matrixInput[i].length; j++)
//			{
//				System.out.println("j: " + j);
//				System.out.println("Matrix: " + matrixInput[i][j]);
//				// If there is an element 0 in this row + columns then...
//				if(matrixInput[i][j] == 0)
//				{
//					System.out.println("Enter");
//					// Start a loop to loop through all elements in that said row and instantiate it to 0
//					for(int k = 0; k < matrixInput[i].length; k++)
//					{
//						matrixInput[i][k] = 0;
//					}
//					
//					// Start another loop to loop through all the elements in that said columns and instantiate it to 0
//					for(int l = 0; l < matrixInput.length; l++)
//					{
//						matrixInput[l][j] = 0;
//					}
//					// There is no longer a need to check the rest of the elements in this row as all have been changed to 0. Move on to the next one
//					break;
//				}
//			}
//		}
//		return matrixInput;
//	}
}
