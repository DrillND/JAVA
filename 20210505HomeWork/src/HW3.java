import java.util.Random;

public class HW3 {

	public static void main(String[] args) 
	{
		/*
		3. 1~45의 숫자를 랜덤으로 발생시켜 로또 프로그램 만들기.
		 조건1) for, while, do-while 사용
		 조건2) 동일한 숫자가 발생하는것은 무시(배열에서 처리 필요)
		 --------------------
		 간단한 로또 프로그램 v1.0
		 --------------------
		 23 7 10 11 39 44
		 */
		
		Random r = new Random();
		
		for (int i =0; i<6; i++)
		{
			int num = r.nextInt(46);
			System.out.print(num+" ");
		}
		

	}

}
