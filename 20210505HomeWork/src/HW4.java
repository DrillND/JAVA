import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) 
	{
		/*
		4. 2개의 숫자를 입력 받아서 첫번째 숫자는 시작, 두번째 숫자는 마지막을 나타냄. 
		 시작부터 끝까지 수의 합을 구하기.
		 조건1) 입력받는 2번째의 수가 첫번째 수보다 작거나 같으면 에러를 
		 표시하고 다시 2번째 숫자를 입력 받도록 처리.
		 1.Num1 입력=> 1
		 2.Num2 입력=> 10
		 1~10까지의 합 : 55
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요. : ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		for(int i = num1;i<=num2-num1+1;num1++)
		{
			 
			sum = sum + num1;
			
		}
		//System.out.printf("%d ~ %d까지의 합 : ",num1,num2);
		System.out.println(sum);
	}

}
