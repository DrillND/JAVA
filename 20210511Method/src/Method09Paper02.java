import java.util.Scanner;

/*
2. 숫자2개와 사칙연산자를 입력받아서 동작하는 간단한 계산기 프로그램.
조건1) 숫자2개와 사칙연산자(+,-,*,/)는 main()에서 입력받음.
조건2) 숫자2개와 사칙연산을 메쏘드에 매개변수로 전달.
조건3) 계산 결과값은 메쏘드에서 리턴값을 받아서 출력하기.
*/

public class Method09Paper02 {

	public static void main(String[] args) {
		System.out.println("1. 숫자 입력 : ");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println("연산자 입력(+,-,*,/) : ");
		String op = s.next();
		System.out.println("2. 숫자 입력 : ");
		int num2 = s.nextInt();

		cal(num1, op, num2);
		s.close();
	}

	public static void cal(int num1, String op, int num2) {
		if (op.equals("+")) {
			System.out.println(num1 + num2);
		} else if (op.equals("-")) {
			System.out.println(num1 - num2);
		} else if (op.equals("*")) {
			System.out.println(num1 * num2);
		} else if (op.equals("/")) {
			System.out.println(num1 / num2);
		}

	}

}
