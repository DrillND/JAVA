import java.util.Scanner;

public class SwitchExam2 {

	public static void main(String[] args) {
		//-------------------------
		//담배자판기 프로그램 v1.0
		//-------------------------
		//원하는 담배를 메뉴에서 선택하세요.
		//1. 에쎄 골드 리프		: 6,000원
		//2. 에쎄 스페셜 골드	: 5,000원
		//3. 더원 블루			: 4,500원
		//4. 더원 오렌지		: 4,500원
		//5. 더원 화이트		: 4,500원
		//--------------------------
		//담배를 선택하세요 : 5
		//더원 화이트를 선택하셨습니다.
		//--------------------------
		//담배 금액을 투입하세요: 10000
		//더원 화이트를 구매했습니다.
		//거스름돈 5500원을 받으세요.
	
		
	System.out.println("-------------------------");
	System.out.println("//담배자판기 프로그램 v1.0");
	System.out.println("-------------------------");
	System.out.println("원하는 담배를 메뉴에서 선택하세요.");
	System.out.println("1. 에쎄 골드 리프	: 6,000원");
	System.out.println("2. 에쎄 스페셜 골드	: 5,000원");
	System.out.println("3. 더원 블루	: 4,500원");
	System.out.println("4. 더원 오렌지	: 4,500원");
	System.out.println("5. 더원 화이트	: 4,500원");
	System.out.println("--------------------------");
	System.out.println("담배를 선택하세요 :");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	switch (num)
	{
	case 1:
		System.out.println("에쎄 골드 리프를 선택하셨습니다.");
		int num1 = 6000;
		break;
		
	case 2:
		System.out.println("에쎄 스페셜 골드를 선택하셨습니다.");
		int num2 = 5000;
		break;
	case 3:
		System.out.println("더원 블루를 선택하셨습니다.");
		int num3 = 4500;
		break;
	case 4:
		System.out.println("더원 오렌지를 선택하셨습니다.");
		int num4 = 4500;
		break;
	case 5:
		System.out.println("더원 화이트를 선택하셨습니다.");
		int num5 = 4500;
		break;
	}
	System.out.println("--------------------------");
	System.out.println("담배 금액을 투입하세요. :");
	int money = sc.nextInt();
	
	switch (num)
	{
	case 1:
		if (money>=6000)
		{
			System.out.println("에쎄 골드 리프를 구매하셨습니다.");
			System.out.printf("거스름돈 %d원을 받으세요.",money-6000);
		}
		
		else if (money<6000)
		{
			System.out.println((6000-money)+"원이 부족합니다.");
		}
		break;
	case 2:
		if (money>=5000)
		{
			System.out.println("에쎄 스페셜 골드를 구매하셨습니다.");
			System.out.printf("거스름돈 %d원을 받으세요.",money-5000);
		}
		else if (money<5000)
		{
			System.out.println((5000-money)+"원이 부족합니다.");
		}
		break;
	case 3:
		if (money>=4500)
		{
			System.out.println("더원 블루를 구매하셨습니다.");
			System.out.printf("거스름돈 %d원을 받으세요.",money-4500);
		}
		else if (money<4500)
		{
			System.out.println((4500-money)+"원이 부족합니다.");
		}
		break;
	case 4:
		if (money>=4500)
		{
			System.out.println("더원 오렌지를 구매하셨습니다.");
			System.out.printf("거스름돈 %d원을 받으세요.",money-4500);
		}
		else if (money<4500)
		{
			System.out.println((4500-money)+"원이 부족합니다.");
		}
		break;
	case 5:
		if (money>=4500)
		{
			System.out.println("더원 화이트를 구매하셨습니다.");
			System.out.printf("거스름돈 %d원을 받으세요.",money-4500);
		}
		else if (money<4500)
		{
			System.out.println((4500-money)+"원이 부족합니다.");
		}
		break;
	}
	
	sc.close();
	
	}
	

}
