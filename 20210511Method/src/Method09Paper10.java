import java.util.Scanner;

/*
10. 입력 받은 수의 팩토리얼을 구하는 프로그램.
조건1) 숫자는 main()에서 입력받음.
조건2) 3을 입력하면 3!(3x2x1), 4를 입력하면 4!(4x3x2x1)이 동작.
조건3) 재귀함수(메쏘드)로 구현.
 */
public class Method09Paper10 {

	public static void main(String[] args) {
		System.out.println("팩도리얼 할 숫자 입력 : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		fac();
	}
	
	public static void fac() {
		
	}

}
