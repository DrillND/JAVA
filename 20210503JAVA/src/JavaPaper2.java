import java.util.Scanner;

public class JavaPaper2 {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("대소 비교 프로그램 v1.0");
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("num2 입력 : ");
		int num2 = sc.nextInt();
		
		if (num1>num2)
		{
			System.out.printf("%d이 %d보다 크다.",num1,num2);
		}
		else if (num1<num2)
		{
			System.out.println(num1+"이"+num2+"보다 작다.");
		}
		else if (num1==num2)
		{
			System.out.println(num1+"과"+num2+"는 같다.");
		}
		
		sc.close();
	}

	
	
	
}
