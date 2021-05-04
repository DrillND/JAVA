
public class Practice {

	public static void main(String[] args) 
	{
		int arr3[][][] = 
			{ 
				{ 
					{ 1, 2, 3 }, 
					{ 3, 4, 5 } 
				},
				
				{ 
					{ 5, 6, 7 }, 
					{ 6, 7, 8 }
				},
			};
		
		System.out.println(arr3[1][0][2]);
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
		
		//int arr4[][][][] = {1,2},{3,4},{5,6}
		
	}

}
