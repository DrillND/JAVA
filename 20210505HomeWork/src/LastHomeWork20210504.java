import java.util.Scanner;

public class LastHomeWork20210504 {

	public static void main(String[] args) 
	{
		//1. 입력받는 값의 범위 1~65535
		//2. int 배열크기 16으로 사용하여 각각의 공간에 이진수 0,1 저장
		//3. 10진수를 2진수로 변경하여 2번 배열에 저장하여 출력
		//4. 8을 입력하면 000010000 출력
		//	 255를 입력하면 11111111 출력
		//	 256을 입력하면 00000001 00000000 출력 1차원 배열 사용

		System.out.println("2진수로 변환 할 정수 입력(1~65535) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		if (num <= 255 )
		{
			
			int arr1[] = new int[8];
			/*
			for (int i=0;i<8;i++)
			{
				arr1[i]=num%2;
				//arr1[i+1]=arr1[i]%2;
			
				//arr1[i]=(i%2);
				//System.out.println(arr1[i-2]=((arr1[i-1])/2)%2);
				System.out.print(arr1[i]);
				num=num/2;
				
				
			}
			System.out.println();
			*/
			for (int i=8-1;i>=0;i--)
			{
				arr1[i]=num%2;
				System.out.print(arr1[i]);
				num=num/2;
			}
			System.out.println();
			System.out.print(arr1);
			System.out.println();
			
			for (int i=0;i<arr1.length;i++)
			{
				System.out.print(arr1[i]);
			}
		}
		
		else if (num >=256)
		{
			int arr1[] = new int[16];
			for(int i= arr1.length-1;i>0;i--)
			{
				arr1[i]=num%2;
				num=num/2;
				System.out.print(arr1[i]);
			}
			
		}
		
		//arr1[num]=num%2;
		//System.out.println(arr1[num]=(i));
		
		
		
		sc.close();
	}

}
