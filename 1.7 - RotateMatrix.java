import java.util.*;

class RotateMatrix 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		// Dummy data to show that it works
		int[][] matrixInput = new int[][]{
				{ 2, 4, 3, 1 },
				{ 3, 1, 2, 1 },
				{ 1, 4, 1, 3 },
				{ 1, 2, 4, 1 }
		};
		
		RotateMatrix(matrixInput);
	}
	
	public static void RotateMatrix(int[][] matrixInput)
	{
		// Lets assume first that we are given 2D array with NxN value. We need to find N
		int length = matrixInput.length;
		
		// Generate another 2D array as an end result
		int[][] matrixRotated = new int[length][length];
		
		// Populate the new matrix with the rotated matrix formula
		for(int i = 0; i < matrixInput.length; i++)
		{
			for(int j = 0; j < matrixInput[i].length; j++)
			{
				// LHS: For each row, populate from the back. RHS: Use element going by column instead of rows. 
				//End result: Populate each row of rotated matrix going backwards with each increment of element taken from given matrix going downwards
				// -1 is to compensate for index always starting at 0
				matrixRotated[i][length - 1 - j] = matrixInput[j][i];
			}
		}
		
		// Print the final result
		for(int i = 0; i < matrixRotated.length; i++)
		{
			for(int j = 0; j < matrixRotated[i].length; j++)
			{
				System.out.print(matrixRotated[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
