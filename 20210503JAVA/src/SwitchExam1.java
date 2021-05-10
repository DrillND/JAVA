import java.util.Scanner;

public class SwitchExam1 {

	public static void main(String[] args) {
		//--------------------------
		//식당메뉴 자동 주문 프로그램 v1.0
		//--------------------------
		//원하는 식사를 선택하세요
		//1. 소고기 : 5000원
		//2. 회 : 10000원
		//3. 돼지고기 : 3000원
		//4. 닭고기 : 2000원
		//5. 양고기 : 4000원
		//--------------------------
		//메뉴 선택:
		
		//[출력형태]
		//비빔밥을 주문했습니다.
		
		System.out.println("--------------------------");
		System.out.println("식당메뉴 자동 주문 프로그램 v1.0");
		System.out.println("--------------------------");
		System.out.println("1. 소고기 : 5000원");
		System.out.println("2. 회 : 10000원");
		System.out.println("3. 돼지고기 : 3000원");
		System.out.println("4. 닭고기 : 2000원");
		System.out.println("5. 양고기 : 4000원");
		System.out.println("--------------------------");
		
		System.out.println("메뉴 선택: ");
		Scanner sc = new Scanner(System.in);
		String menu = sc.next();
		
		switch(menu)
		{
		case "1" :
			System.out.println("소고기를 선택");
			break;
		case "2" :
			System.out.println("회를 선택");
			break;
		case "3" :
			System.out.println("돼지고기를 선택");
			break;
		case "4" :
			System.out.println("닭고기를 선택");
			break;
		case "5" :
			System.out.println("양고기를 선택");
			break;
		}
		
		sc.close();
	}

}
