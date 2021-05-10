import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Array2self {

	public static final int MENU_FILE_WRITE = 1;
	// 객체가 생성되는 곳과 다른 영역, 파이널 상수 변수(대문자를 쓴다), 클래스 이름 첫글자 대문자
	// 상수 변수 파이널이라면 상수형 변수 1로 고정된다.
	// 하드 코딩
	public static final int MENU_FILE_READ = 2;
	public static final int MENU_FILE_EXIT = 3;

	public static void main(String[] args) {
		String firstName[] = { "김", "박", "이", "최", "장" };
		String midName[] = { "바", "사", "아", "자", "차" };
		String lastName[] = { "가", "나", "다", "라", "마" };
		Random r = new Random();
		// Scanner s = new Scanner(System.in);
		String fullName[] = new String[50];
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("---------------------------");
			System.out.println("파일 제어 프로그램 v1.5");
			System.out.println("---------------------------");
			System.out.println("1. 이름 생성히여 파일에 저장");
			System.out.println("2. 파일에서 이름 읽어오기");
			System.out.println("3. 프로그램 종료");
			System.out.println("---------------------------");
			System.out.println("메뉴를 선택 : ");

			int menu = s.nextInt();

			switch (menu) {
			case MENU_FILE_WRITE:
				FileOutputStream output = null;
				try {
					output = new FileOutputStream("testJava.text");
					for (int i = 0; i < 50; i++) {
						// System.out.println("파일 생성 및 쓰기 처리");
						fullName[i] = firstName[r.nextInt(5)] + midName[r.nextInt(5)] + lastName[r.nextInt(5)];
						System.out.println("번호: " + (i + 1) + " " + fullName[i]);
						fullName[i] += "\n";
						
						output.write(fullName[i].getBytes());
					}
				output.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			case MENU_FILE_READ:
				System.out.println("파일 읽기 처리");
				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader("testJava.text"));
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}
				while (true) {
					String line = null;
					try {
						line = br.readLine();
					} catch (IOException e) {

						e.printStackTrace();
					}
					if (line == null)
						break;
					System.out.println(line);
				}
				try {
					br.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
				break;

			case MENU_FILE_EXIT:
				System.out.println("프로그램 종료");
				s.close();
				System.exit(0);

			}

		}

	}
}