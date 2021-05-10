
public class Array1 {

	public static void main(String[] args) 
	{
	int[] arr = new int[100];
	for (int i = 0; i<100; i++) // 배열을 다룰때는 초기값을 0으로 하는것이 유리하다.
	{
		arr[i]= i+1;
		//System.out.println(arr[i]); //디버깅 코드
		if(arr[i]%5==0)
		{
			System.out.println(arr[i]);
		}
		if (i == 89)
		{
			break;
		}
	}
	
	int arr2[][] = {
			{1,2},{2,4,6},{3,6},
			{4,8,10,12},{10}
	};
	
	for(int i=0; i<arr2.length; i++)
	{
		for(int j=0; j<arr2[i].length; j++)
		{
			System.out.print(arr2[i][j]+"\t");
		}
		System.out.println();
	}
	
	int arr9 [][] = new int[9][8];
	for(int i = 1; i<=9; i++)
	{
		for(int j =2; j<=9; j++)
		{
			arr9[i-1][j-2] = j * i;
			System.out.printf("%d x %d = %d\t",j,i,arr9[i-1][j-2]);
			
		}
		System.out.println();
	}
	System.out.println();
	
	int arr10 [][] = new int[9][8];
	for(int i = 0; i<9; i++)
	{
		for(int j =0; j<8; j++)
		{
			arr10[i][j] = (j+2) * (i+1);
			System.out.printf("%d x %d = %d\t",j+2,i+1,arr10[i][j]);
			
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	}

}
