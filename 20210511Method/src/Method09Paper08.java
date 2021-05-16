/*
8. 구구단 2~9단까지 전체 출력중에 홀수단만 출력하는 프로그램.
조건1) 홀수단만 출력하는 메쏘드를 작성.
조건2) 출력 형식은 다음과 같이.

3X1=3  5X1=5  7X1=7  9X1=9
3X2=6  5X2=10 7X2=14 9X2=18
 .      .      .      .
 .      .      .      .
3X9=27 5X9=45 7X9=63 9X9=81
 */
public class Method09Paper08 {

	public static void main(String[] args) {
		
		ood();

	}
//0 1 2 3
	public static void ood() {
		for (int i = 0; i < 9 ; i++) {
			for (int j=3; j<10; j=j+2) {
				System.out.printf("%dX%d=%d\t",j,i+1,j*(i+1));
			}
			System.out.println();
		}
	}
}
