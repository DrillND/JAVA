import java.util.Random;

public class Test {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("간단한 로또 프로그램 v.1.1");
		System.out.println("----------------------");
		
		Random r = new Random();
		
		int arr[] = new int[6];
		
		for (int i = 0; i<arr.length; i++)
		{
			int num = r.nextInt(46);
			
			arr[i]=num;
			//System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i<arr.length; i++)
		{
			for (int j = 0; j<i; j++)
			{
				if(arr[i]==arr[j])
				{
					i--;
					//arr[i]=r.nextInt(46);
				}
				
			}
			System.out.print(arr[i]+" ");
		}
	}

}
