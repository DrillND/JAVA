
public class Class03Sum {
	int sum;
	int avg;
	int[] arr;
	
	public Class03Sum(int[] arr) {
		this.arr = arr;
		for(int i : arr ) {
			sum += i;
		}
		avg = sum/arr.length;
		System.out.println("합 : "+ sum);
		System.out.println("평균 : "+ avg);
	}
	
	
	public int getSum() {
		return sum;
	}
	
	
	public int getAvg() {
		return avg;
	}
}
