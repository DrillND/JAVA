import java.util.Scanner; //syso ctrl+space

public class JavaPaper1 {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("홀짝 판단 프로그램 v1.0");
		System.out.println("-------------------");
		System.out.println("숫자 입력 : ");
		
		Scanner cs = new Scanner(System.in); //스캐너 대문자는 클래스(클래스는 무조건 대문자) 라이브러리에 있는 내장 클래스를 불러와서 사용
		int num = cs.nextInt();
		
		if (num%2==0)
		{
			System.out.println("입력한 숫자는 짝수입니다.");
		}
		else
		{
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		
		cs.close();
	}

}
