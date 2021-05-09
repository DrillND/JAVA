
public class For_PrintOut {

	public static void main(String[] args) 
	{
		// 10개의 int형 데이터를 갖는 배열 arrayTest 선언
        int[] arrayTest = new int[10];

         // for문을 이용해서 arrayTest에 10 ~ 100의 값을 저장
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayTest[i] = (i + 1) * 10);
            //System.out.println(arrayTest[i] + "\t");
        }

         // for문으로 배열 각각의 값을 출력
       // for (int i = 0; i < arrayTest.length; i++) {
           // System.out.println(arrayTest[i] + "\t");    // \t: tab만큼의 공백을 뜻함
        }
         // 10    20    30    40    50    60    70    80    90    100
		

	}


