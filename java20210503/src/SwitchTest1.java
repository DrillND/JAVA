import java.util.Random;

public class SwitchTest1 {

	public static void main(String[] args) {
		//0~3 사이 랜덤 숫자 발생
		//int time = (int)(Math.random()*4);
		Random r = new Random(); // import 해야됨
		int time = r.nextInt(4) + 8;
		//System.out.println(time);
		System.out.println(time);
		
		switch(time)
		{
		case 8 :
			System.out.println("출근");
			break;
		case 9:
			System.out.println("회의 시작");
			break;
		case 10:
			System.out.println("업무 시간");
			break;
		default: // 케이스 외의 값
			System.out.println("외근중");
			break;
		}
		
		
	}
	
	

}
