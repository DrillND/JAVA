
public class Array1 {

	public static void main(String[] args) 
	{
		int[] num = {10, 20, 30, 40, 50};
		int num2[] = {10, 20};
		int num3[] = new int[10]; // new 메모리 할당 프로그램 종료해도 안 없어진다, new로 생성하는 변수는 가비지 컬렉터가 사용안하면 정리.
		
		
		for (int i =0; i<num3.length; i++)
		{
			num3[i]=10;
		}
		
		int arr1[][] = new int[2][3]; //배열에서 행열은 정해져 있다. arr1는 주소 
		for (int i =0; i<arr1.length; i++)
		{
			for(int j=0; j<arr1[i].length; j++)
			{
				
			}
			
		}
		
		int[][] arr2 =  //3행 2열
			{ 
					{1,2,3},{4},{7,8,9,10}	
			};
		
		System.out.println(arr2.length);
		
		for (int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				System.out.print(arr2[i][j]+" "); //숫자와 문자로 합하면 통째로 문자로 된다. 문자열 정보가 되어버림.
			}
			System.out.println();
		}
		
		System.out.println("================="); // 향상된 for문
		for(int[] i : arr2)
		{
			for(int j : i)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		int arr3[][][] = 
			{
					{{1,2,3}, {3,4,5}},
					{{5,6,7}, {6,7,8}},
			};
		
		for (int i=0; i<arr3.length; i++)
		{
			for(int j=0; j<arr3[i].length; j++)
			{
				for(int k=0; k<arr3[i][j].length; k++)
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
