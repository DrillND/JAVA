import java.util.Random;

/*
 6. 간단한 로또 프로그램.
조건1) 동일한 숫자가 발생하지 않도록 처리 바람.
      (할수있는데까지 꼭 고민해보시고 힘들면 중복처리 무시!)
조건2) 메쏘드에서 로또 번호를 만들고 배열에 6개의 번호를 저장하여 리턴
조건3) main()에서 로또 번호가 들어있는 배열를 리턴받아서 출력하기

        - 메쏘드에서 로또 배열 출력하는것이 아님!
 */

//배열정보를 리턴해라 리턴을 써야된다.
public class Method09Paper06 {

	public static void main(String[] args) {

		System.out.println("\n----------------------");
		System.out.println("로또 생성 프로그램 v1.2");
		System.out.println("----------------------");

		int arr[] = lotto();
		System.out.println();
		for (int n : arr) {
		System.out.print(n + " ");
		}
	}

	public static int[] lotto() {
		Random r = new Random();
		int lottoArr[] = new int[6];
		System.out.println("랜덤 숫자 발생");
		for (int i = 0; i < lottoArr.length; i++) { // 로또번호 6개 뽑기
			int num = r.nextInt(45) + 1;
			System.out.print(num + " "); //랜덤 숫자
			lottoArr[i] = num;
			for (int j = 0; j < i; j++) {
				if (num == lottoArr[j]) {
					i--;
					//num=null; 초기화 해도 되는데 안하면 덮어쓴다. 그래서 상관은 없음.
					break;

				}
			}
		}
		return lottoArr;

	}

}
