import java.util.Random;

/*
 3. 홀수, 짝수 구분하는 프로그램.
조건1) 10개의 숫자를 저장하기위한 배열 생성.
조건2) 랜덤하게 10개의 숫자를 main()에서 배열에 저장.
조건3) 랜덤한 값을 가지는 배열을 매개변수로 전달하여 홀,짝수를 구분하는 메쏘드 작성.
 */
public class Method09Paper03 {

	public static void main(String[] args) { //메인이 진입 점 
		int arr[] = new int[10];
		Random r = new Random(); // new 객체를 생성한다. (객체지향 프로그램에서)

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100)+1; //0이 들어가는 것을 막기위해서 1을 플러스 (1~100)
			System.out.println(arr[i]);
		}
		HT(arr); //arr의 주소값이 메쏘드로 전달, 배열의 시작 주소 위치 던져 준다. 배열은 어딘가에 잡혀있고 위치 정보를 주고 받으면서 값을 받는다. C에서의 포인트 개념
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
