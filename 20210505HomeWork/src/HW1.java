import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) 
	{
		/*
		 1. 3개의 숫자를 입력받아서 홀수, 짝수를 구분하는 프로그램.
		 조건1) for, while, do-while 사용
		 ---------------------------
		 짝수,홀수 구분 프로그램 v1.0
		 ---------------------------
		 1.Num1 => 6
		 짝수입니다.
		 2.Num2 => 71
		 홀수입니다.
		 3.Num3 => 34
		 짝수입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++)
		{
			System.out.println("숫자를 입력하세요. : ");
			int num = sc.nextInt();
			if (num%2==0)
			{
				System.out.println("짝수입니다.");
			}
			else if (num==0)
			{
				System.out.println("0은 홀수도 짝수도 아닙니다.");
			}
			else
			{
				System.out.println("홀수입니다.");
			}
		}
		sc.close();

	}

}
