import java.util.Scanner;

/*
 5. 1개의 숫자를 입력받아서 구구단 출력하는 프로그램.
조건1) 숫자 입력은 main() 에서 입력 받음.
조건2) 3을 입력받으면 3단 출력, 5를 입력받으면 5단을 출력.
조건3) 숫자를 매개변수로 전달하여 구구단을 출력하는 메쏘드 작성.
 */

public class Method09Paper05 {

	public static void main(String[] args) {
		System.out.println("출력할 구구단 단수 입력 : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		dan(num);
	}

	public static void dan(int num) {
		for (int i = 0; i < 9; i++) {
			System.out.println(num+"x"+(i+1)+"="+num*(i+1));
		}

	}
}
