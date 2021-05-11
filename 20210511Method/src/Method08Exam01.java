import java.util.Scanner;

public class Method08Exam01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int num1 = s.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int num2 = s.nextInt();
		System.out.println("세번째 숫자 입력 : ");
		int num3 = s.nextInt();

		System.out.println();
		sizenum(num1, num2, num3);

	}

	public static void sizenum(int num1, int num2, int num3) {
		int arr[] = new int[3];
		arr[0] = num1;
		arr[1] = num2;
		arr[2] = num3;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					if (arr[i] > arr[j + 1]) {
						System.out.println(arr[i]);
					}
				}
				else if (arr[i]<arr[j]) {
					if (arr[i]<arr[j+1]) {
						System.out.println(arr[i]);
					}
					
				}
			}
		}
	}

}
