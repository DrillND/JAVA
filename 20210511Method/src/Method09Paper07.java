/*
 7. 1 ~ 100까지의 합을 구하는 프로그램.
조건1) 메쏘드에서 짝수들의 합과 홀수들의 합을 배열에 저장.
조건2) 메쏘드에서 짝수합과 홀수합을 배열에 저장하고 리턴하기.
조건3) main()에서 메쏘드로부터 배열을 리턴받아 홀수합, 짝수합 출력하기.
 */
public class Method09Paper07 {

	public static void main(String[] args) {
		System.out.println(evensum());
	}

	public static int[] evensum() {
		int arr[] = new int[50];
		for(int i = 0; i<50; i++) {
			arr[i]=(i+1)*2;
		}
		
		return arr;
	}
	
	//public static int[] oddsum() {
		
		//return arr;
	//}
}
