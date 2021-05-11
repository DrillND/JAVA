import java.util.Scanner;
/*
1. 3개의 숫자를 입력받아서 크기가 큰 순서대로 출력하는 프로그램.

주의) 정렬 알고리즘 또는 배열을 사용하지 말고 IF 문으로만 해결 바람.

조건1) 3개의 숫자는 main() 에서 입력 받음.
조건2) 3개의 입력받은 숫자를 매개변수로 전달하여 크기가 큰 순서대로 출력하는
       메쏘드를 작성.﻿
조건3) 5, 20, 15를 입력받으면, 20-15-5 형식으로 출력하기. --> 내림 차순 정렬
*/

public class Method09Paper01 {

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
				} else if (arr[i] < arr[j]) {
					if (arr[i] < arr[j + 1]) {
						System.out.println(arr[i]);
					}

				}
			}
		}
	}

}
