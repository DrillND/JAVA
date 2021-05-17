import java.util.Random;

/*
11. 학점을 출력하는 프로그램.
조건1) 5명의 국, 영, 수 점수는 Random 클래스를 사용하여 랜덤하게 생성.
조건2) 2차원배열을 생성하여 1번째 학생의 국,영,수 점수를 1행1열, 1행2열, 1행3열에 저장.
조건3) 2번째 학생의 점수는 2행 ~ 5번째 학생의 점수는 5행에 각각 저장.
조건4) 5명학생의 점수들을 저장한 배열을 리턴하기.
조건5) main()에서 배열값을 받아 학생1명씩 대한 총점, 평균, 학점을 출력하기.
      --> 출력 형식은 자유롭게 생각해서 하되 깔끔하게 처리.
조건6) 학점 기준 점수
      100 ~ 90 -> A학점 출력
       89 ~ 80 -> B학점 출력
       79 ~ 70 -> C학점 출력
       69 ~ 60 -> D학점 출력
       59 ~ 50 -> E학점 출력
       49 ~  0 -> F학점	
 */
public class Mon03 {

	public static void main(String[] args) {
		int sum = 0;
		int arr[][] = getScore(); //리턴받는다 배열의 주소값
		for (int [] i : arr) {
			for(int j : i) {
				System.out.print(j + "\t");
				sum += j;
			}
			System.out.print("총점 : "+ sum);
			System.out.print(" 평균 : "+ (sum/3));
			System.out.print(" "+getHakjum(sum/3));
			System.out.println();
			sum = 0;
		}
		
	}

	public static int[][] getScore() {
		Random r = new Random();
		int[][] score = new int[5][3];
		int data[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = data[r.nextInt(10)];
				System.out.print(score[i][j] + "\t"); // 디버깅 코드
			}
			System.out.println();
		}
		return score;
	}
	
	
	public static String getHakjum(int sum) {
		String result = null;
		if (sum >= 90) {
		 	result = "A";
		}
		else if (sum >= 80 ) {
			result = "B";
		}
		else if (sum >= 70) {
			result = "C";
		}
		else if (sum >= 60 ) {
			result = "D";
		}
		else if (sum >= 50) {
			result = "E";
		}
		else {
			result = "F";
		}
		return result;
	}
}
