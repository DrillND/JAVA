import java.util.Scanner;

public class JavaTest1 {

	public static void main(String[] args) {
		
		// 주석: /**/, Ctrl /
		// 자바 기본 출력
		
		/*
		System.out.println("111");
		System.out.print("222" + "\n");
		System.out.println("333");
		System.out.printf("%d\n", 100);
		
		// 입력, 첫 글자 대문자는 클래스를 의미
		Scanner sc = new Scanner(System.in); //뒤에 스캐너 생성자(객체를 생성함)
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		System.out.print("이름 입력: ");
		String name = sc.next(); //또는 nextLine
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		//sc.close(); // 자원 반납, 아니면 메모리가 샌다.
		
		// 국어, 영어, 수학 점수를 입력 받고 총점과 평균을 구하는 프로그램 작성.
		
		System.out.print("국어 점수 입력: ");
		int korea = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		int english = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		int meth = sc.nextInt();
		
		System.out.println("총점: " + (korea + english + meth));
		System.out.println("평균: " + (korea + english + meth)/3); 
		*/
		
		// 동전은 각각 500, 100, 50, 10원 사용
		//특정 금액 입력 ex) 1260
		//----------------------
		//동전 교환 프로그램 v1.0
		//----------------------
		//오백원 개수: 2개
		//일백원 개수: 2개
		//오십원 개수: 1개
		//일십원 개수: 1개
		//----------------------
		
		Scanner sc2 = new Scanner(System.in); //뒤에 스캐너 생성자(객체를 생성함)
		System.out.println("금액 입력: ");
		int money = sc2.nextInt();
		int money500 = money/500;
		int money100 = money/100;
		int money50 = money/50;
		int money10 = money/10;
		
		System.out.println("--------------------");
		System.out.println("동전 교환 프로그램 v1.0");
		System.out.println("--------------------");
		System.out.printf("오백원 개수: %d\n", money500%500);
		System.out.printf("일백원 개수: %d\n", money100%100);
		System.out.printf("오십원 개수: %d\n", money50%50);
		System.out.printf("일십원 개수: %d\n", money10%10);
		System.out.println("--------------------");
		
		sc2.close();
		
	}

}
