import java.util.Scanner;

/*
10. 입력 받은 수의 팩토리얼을 구하는 프로그램.
조건1) 숫자는 main()에서 입력받음.
조건2) 3을 입력하면 3!(3x2x1), 4를 입력하면 4!(4x3x2x1)이 동작.
조건3) 재귀함수(메쏘드)로 구현.
 */
public class Method09Paper10 {

	public static void main(String[] args) {
		System.out.print("팩도리얼 할 숫자 입력 : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		

		fact(n); //매개변수 혹은 전역변수 =>프로그램 디버깅 할 시 전역변수는 어렵다. 보편적으로 지역변수를 쓴다.
		System.out.println(fact(n));
	}
	
	public static int fact(int n) {
		if (n <= 1) {
			return n; //or 1리턴해도 된다.(마지막에 1 한 번 더 찍힌다.
		}
		else {
			return n * fact(n-1);
		}
	}
//1이 리턴되고 다시 2로 넘어가서 1*2가 다시 3으로 리턴되서 마지막으로 3*2*1 이 답으로 리턴된다.
}
