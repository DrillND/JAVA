
public class Method05Array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int arr2[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		showAddArr(arr); // arr 주소값 포인트 개념
		System.out.println();
		showAddArr(arr2);
		
		int retArr[] = getArr();
		for(int i : retArr) {
			System.out.println(i+" ");
		}
	}

	public static void showAddArr(int arr[]) { // int [] arr
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void showAddArr(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] getArr() {
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= i + 100;
		}
		return arr;
	}

}
