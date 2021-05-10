import java.util.Random;

public class Test {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("간단한 로또 프로그램 v.1.1");
		System.out.println("----------------------");
		
		Random r = new Random();
		
		int arr[] = new int[6];
		for (int i = 0; i<6; i++)
		{
			int num = r.nextInt(46);
			
			arr[i]=num;
			System.out.print(arr[i]+" ");
		}
	}

}
