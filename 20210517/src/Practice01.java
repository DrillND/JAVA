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
public class Practice01 {

	public static void main(String[] args) {
		
		lotto();
		
		

	}
	
	public static void lotto() {
		
		int [] arr = new int [6];
		Random r = new Random();
		for(int i = 0; i<arr.length; i++) {
			arr[i]= r.nextInt(45)+1;
		}
	
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" "); //중복 허용
		}
		System.out.println();
		System.out.println("================");
		
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
				
			}
			
		}
		
	}

}
