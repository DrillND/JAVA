import java.util.Scanner;

public class Array2Answer {

	public static void main(String[] args) 
	{
		int[] binArr = new int[16];
		Scanner s = new Scanner(System.in);
		System.out.print("정수 입력(1~65535): ");
		int num = s.nextInt();
		
		int index=0;
		while (num !=1)
		{
			binArr[index++] = num%2;
			num /= 2;
			System.out.println(binArr[index]);
		}
		binArr[index] = num;
		
		for (int i=7; i>=0; i--)
		{
			System.out.println(binArr[i] + " ");
		}
		//System.out.println(binArr[index]);
		
		s.close();
	}

}
