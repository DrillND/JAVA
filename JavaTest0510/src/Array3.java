
import java.util.Random;

public class Array3 {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("간단한 로또 프로그램 v.1.1");
		System.out.println("----------------------");
		/*
		Random r = new Random();
		int n = 0;
		for (int i = 0; i < 6; i++) {
			n = r.nextInt(45) + 1;
			System.out.print(n + " ");
		}
		System.out.println();
		*/

		Random d = new Random();
		int arr[] = new int[6];
		int n2 = 0;
		for (int i = 0; i < 6; i++) {
			n2 = d.nextInt(45) + 1;
			arr[i] = n2;
			//System.out.print(arr[i]+" ");
		}
		
		int arr2[] = new int[6];
		for (int i = 0; i<arr.length; i++)
		{
			for (int j=0;j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=n2;
					System.out.print(arr[j]+" ");
				}
				else
				{
					arr2[i] = arr[j];
					System.out.print(arr2[i]+" ");
				}
				
			}
			
		}
		for (int i =0; i<6; i++)
		{
		//System.out.print(arr2[i]+" ");
		}
	}

}
