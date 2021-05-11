import java.util.Random;

/*
 3. 홀수, 짝수 구분하는 프로그램.
조건1) 10개의 숫자를 저장하기위한 배열 생성.
조건2) 랜덤하게 10개의 숫자를 main()에서 배열에 저장.
조건3) 랜덤한 값을 가지는 배열을 매개변수로 전달하여 홀,짝수를 구분하는 메쏘드 작성.
 */
public class Method09Paper03 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
			System.out.println(arr[i]);
		}
		HT(arr);
	}

	public static void HT(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			if (arr[i]%2 == 0) {
				System.out.println(i+1+". "+arr[i]+" : 짝수");
			}
			else if(arr[i]%2 != 0) {
				System.out.println(i+1+". "+arr[i]+" : 홀수");
			}
		}
	}

}
