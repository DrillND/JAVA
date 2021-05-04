
public class Loop1 {

	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50};
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println(); //라인 피드
		
		
		int j = 0;
		while(j < arr.length)
		{
			System.out.print(arr[j]+" ");
			j++;
		}
		
		
		System.out.println();
		
		
		int k = 0;
		do 
		{
			System.out.print(arr[k]+" ");
			k++;
		} while (k < arr.length);
		
		
		System.out.println();
		
		
		//향상된 for 문, arr=배열의 주소값, *arr=값
		for(int num : arr)
		{
			System.out.print(num+ " ");
		}
		
		
		
	}

}
