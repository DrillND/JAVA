import java.util.Scanner;

public class JavaExam3 {

	public static void main(String[] args) {
		//--------------------------
		//학점 관리 프로그램 v1.0
		//--------------------------
		//100 ~ 90 : A학점
		//89 ~ 80 : B학점
		//79 ~ 70 : C학점
		//69 ~ 60 : D학점
		//59 ~ 0 : F학점
		//--------------------------
		// 국어점수 입력 :
		// 수학점수 입력 :
		// 영어점수 입력 : 
		
		//[출력형태]
		//총점: 270, 평균: 90 ,학점: A학점
		
		
		System.out.println("--------------------------");
		System.out.println("학점 관리 프로그램 v1.0");
		System.out.println("--------------------------");
		System.out.println("100 ~ 90 : A학점");
		System.out.println("89 ~ 80 : B학점");
		System.out.println("79 ~ 70 : C학점");
		System.out.println("69 ~ 60 : D학점");
		System.out.println("59 ~ 0 : F학점");
		System.out.println("--------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		int meth = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		int eng = sc.nextInt();
		
		System.out.printf("총점: %d\n",(kor+meth+eng));
		int avg = (kor+meth+eng)/3;
		System.out.println("평균: "+avg);
		
		if (avg >= 90 && avg <=100)
		{
			System.out.println("학점: A학점");
		}
		else if (avg >= 80 && avg <=89)
		{
			System.out.println("학점: B학점");
		}
		else if (avg >= 70 && avg <=79)
		{
			System.out.println("학점: C학점");
		}
		else if (avg >= 60 && avg <=69)
		{
			System.out.println("학점: D학점");
		}
		else
		{
			System.out.println("학점: F학점");
		}
		
		sc.close();
		
		
		
		
	}

}
