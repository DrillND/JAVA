import java.util.Scanner;

//디버깅 꼭 연습연습
public class Array2 {

	public static void main(String[] args) 
	{
		//1. 입력받는 값의 범위 1~65535
		//2. int 배열크기 16으로 사용하여 각각의 공간에 이진수 0,1 저장
		//3. 10진수를 2진수로 변경하여 2번 배열에 저장하여 출력
		//4. 8을 입력하면 000010000 출력
		//	 255를 입력하면 11111111 출력
		//	 256을 입력하면 00000001 00000000 출력 1차원 배열 사용
		
		System.out.println("2진수로 변환할 값 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		//int arr[] = {(((num/2)/2)/2)%2,((num/2)/2)%2,(num/2)%2,num%2};
		//System.out.printf("%d%d%d%d",arr[0],arr[1],arr[2],arr[3]);
		
		int arr2[] = new int[16]; 
		
		for(int i = 0; i<15; i++)
		{
			//arr2[1]=((arr2[2])/2)%2;
			//arr2[2]=((arr2[3])/2)%2;
			//arr2[13]= ((arr2[14])/2)%2;
			//arr2[14]= (arr2[15]/2)%2 ;
			//arr2[15]= num%2; 
			
			arr2[i]=((arr2[i+1])/2)%2;
		}
		
		
		
	}

}
