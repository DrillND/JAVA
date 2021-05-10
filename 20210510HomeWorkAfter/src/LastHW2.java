import java.util.Scanner;

public class LastHW2 {
	public static final int MENU_FILE_WRITE = 1; 
	//객체가 생성되는 곳과 다른 영역, 파이널 상수 변수(대문자를 쓴다), 클래스 이름 첫글자 대문자
	//상수 변수 파이널이라면 상수형 변수 1로 고정된다. 
	//하드 코딩
	public static final int MENU_FILE_READ = 2; 
	public static final int MENU_FILE_EXIT = 3; 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("---------------------------");
			System.out.println("간단한 파일 관리 프로그램 v1.0");
			System.out.println("---------------------------");
			System.out.println("1. 파일 생성 및 쓰기");
			System.out.println("2. 파일 읽기");
			System.out.println("3. 종료");
			System.out.println("---------------------------");
			System.out.println("메뉴를 선택 : ");

			
			int menu = s.nextInt();

			switch (menu) {
			case MENU_FILE_WRITE:
				System.out.println("파일 생성 및 쓰기 처리");
				break;
			case MENU_FILE_READ:
				System.out.println("파일 읽기 처리");
				break;
			case MENU_FILE_EXIT:
				System.out.println("프로그램 종료");
				s.close();
				System.exit(0);

				//break;
			}

		}

	}

}
