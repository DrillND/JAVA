
public class Test {

	public static void main(String[] args) 
	{
		int[] num = {10, 20, 30, 40, 50};
		int num2[] = {10, 20};
		int num3[] = new int[10]; // new 메모리 할당 프로그램 종료해도 안 없어진다, new로 생성하는 변수는 가비지 컬렉터가 사용안하면 정리.
		
		num3[0] = (1); 
		System.out.println(num3[0]);
		
		for (int i =0; i<10; i++)
		{
			
			System.out.print(num3[i]=(i));
		}
		
	}

}
