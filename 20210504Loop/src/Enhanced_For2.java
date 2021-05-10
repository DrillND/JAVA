
public class Enhanced_For2 {
	int a = 100;

	public static void main(String[] args) 
	{
		int arr3[][][] = { { { 1, 2, 3 }, { 3, 4, 5 } }, { { 5, 6, 7 }, { 6, 7, 8 } }, };

		for (int i = 0; i < arr3.length; i++) 
		{
			for (int j = 0; j < arr3[i].length; j++)
			{
				for (int k = 0; k < arr3[i][j].length; k++) 
				{
					System.out.print(arr3[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("향상된 for문 사용");
		for (int[][] i : arr3)
		{
			for(int[] j: i)
			{
				for (int k: j)
				{
					System.out.print(k+ " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}
}
