

public class Enhanced_For1 {

	public static void main(String[] args) 
	{
		/*
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
		*/
		int arr0[]= {1,2,3};
		for (int tt : arr0)
		{
			System.out.println(tt);
		}
		
		
		int arr1[][] = 
			{
				{1,2,3,4,5},{7,8,9,10}
			};
		for (int i[]  : arr1)
		{
			for(int j:i)
			{
			System.out.println(j);
			}
		}
		System.out.println();
		
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
