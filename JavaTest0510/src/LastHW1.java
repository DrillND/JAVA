import java.util.Random;
import java.util.Scanner;

public class LastHW1 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 5 == 0) 
			{
				System.out.println("5의 배수 :" + i);
			}

		}
		// 로또 번호 생성
		for (int i = 0; i < 6; i++) 
		{
			Random r = new Random();
			int n = r.nextInt(45) + 1; // 1에서 (45)까지, 전체에 +1
			System.out.println(n + " ");
		}
		int sum = 0;
		int start = 0;
		int end = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력:");
		start = s.nextInt();
		for(;;) //while (true)
		{
			
			System.out.println("두번째 숫자 입력:");
			end = s.nextInt();
			if (start >= end)
			{
				System.out.println("두번째 숫자를 큰 수로 입력하세요.");
				continue;
			}
			else
			{
				break;
			}
		}
		
		for (int i=start; i<=end; i++)
		{
			sum += i;
			
		}
		System.out.println("합계 : "+ sum);
		
		
		
		
		
		
		
	}

}
