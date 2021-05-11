import java.util.Scanner;

/*
 4. 국,영,수 점수를 입력받아서 총점, 평균값을 구하는 프로그램.
조건1) 점수 입력은 main() 에서 입력 받음.
조건2) 입력받는 점수는 0 ~ 100 사이의 숫자만 입력받도록 조건 체크하기.

        --> 간단하게 한번만 체크하면 됨 (사용자가 실수로 잘못입력하면 에러메시지 출력하고 종료 처리)
조건3) 국,영,수 점수를 각각의 매개변수로 전달하여 총점, 평균값을 출력하는 메쏘드 작성.

조건4) 조건3까지 테스트완료 이후에 잘못입력값 체크를 확장하기(실수로 입력하면 재입력 받을수 있도록 처리)

        --> 시간적인 여유가 있으면 해보고 그렇지 않으면 패스하기 바람.
 */
public class Method09Paper04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수의 총점과 평균값");
		System.out.println("----------------------------");
		
		for(;;) {
			System.out.println("1.국어 점수 입력(0~100) : ");
			int korean = s.nextInt();
			if(korean<=100 && korean>=0) {
				
			}
		}
		
		
		
		if (korean<0) {
			
		}
		System.out.println("2.영어 점수 입력(0~100) : ");
		int english = s.nextInt();
		System.out.println("3.수학 점수 입력(0~100) : ");
		int math = s.nextInt();

		System.out.print("총점 : ");
		sum(korean,english,math);
		System.out.println();
		System.out.print("평균값 : ");
		avg(korean,english,math);

	}

	public static void sum(int num1, int num2, int num3) {
		System.out.print(num1+num2+num3);
	}

	public static void avg(int num1, int num2, int num3) {
		System.out.println((num1+num2+num3)/3);
	}
}
