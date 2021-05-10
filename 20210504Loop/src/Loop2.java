//이중 반복문 = 이차원 배열에서 쓰인다.
public class Loop2 {

	public static void main(String[] args) 
	{
		// 2*1=2 3*1=3 4*1=4...9*1=9
		// 2*2=4 3*2=6 4*2=8...9*2=18
		// ...
		// ...
		// 2*9=18 3*9=27...    9*9=81
		
		for (int i=1; i<10; i++) //2차원 배열에서 행의 역할, 기준!! 소팅 알고리즘?
		{
			for (int j=2; j<10; j++)
			{
				System.out.print(j+"X"+i+"="+(i*j)+"\t");
				//System.out.printf("%dX%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
		
	
		
		
		
		
	}

}
