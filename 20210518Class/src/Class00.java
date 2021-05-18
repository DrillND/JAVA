import java.util.Random;

public class Class00 {

	public static void main(String[] args) {
		/*
		 * 객체지향적인 방법, 일반적인 방법 자바의 최상위 클래스 오브젝트 클래스 상속 객체를 생성한다.
		 */
		StudentScore ss1 = new StudentScore();
		/*
		 * StudentScore 클래스 객체 생성(인스턴스)
		 * 
		 * 인스턴스가 무엇인가? 코드 커서에서 F3 and back(파일로 분리되어있지만 이동 가능)
		 * 
		 * StudendtScore 클래스의 객체를 생성한다. new뒤에 있는 StudentScore(매개변수) '괄호안에는'
		 * StudentScore의 생성자
		 * 
		 * 생성자는 객체를 생성할때 한번만 사용되는 특수한 메서드
		 * 
		 * ss변수가 객체를 참조 객체 덩어리 인스턴스, 인스턴스 안의 변수들 == 인스턴스 변수.
		 * 
		 * new 메모리 새로 할당,메모리 관리 시스템이 스스로 관리.소멸까지 가비지 컬렉터.
		 * 
		 */
		// ss.name = "홍길동";
		ss1.setName("홍길동");
		// System.out.println("이름 : " + ss.name); 메소드로 쓰자
		// ss.kor =100;
		// 캡슐화 은닉화로 접근 못 할 때 메소드를 쓴다.

		ss1.setKor(100);
		System.out.println("이름 : " + ss1.getName());
		System.out.println("국어 : " + ss1.getkor());

		StudentScore ss2 = new StudentScore();
		ss2.setName("김길동");
		ss2.setKor(90);
		System.out.println("이름 : " + ss2.getName());
		System.out.println("국어 : " + ss2.getkor());

		StudentScore ss3 = new StudentScore();
		ss3.setName("박길동");
		ss3.setKor(80);
		System.out.println("이름 : " + ss3.getName());
		System.out.println("국어 : " + ss3.getkor());

		StudentScore ss4 = new StudentScore();
		ss4.setName("전우치");
		ss4.setKor(70);
		System.out.println("이름 : " + ss4.getName());
		System.out.println("국어 : " + ss4.getkor());

		StudentScore ss5 = new StudentScore();
		ss5.setName("이순신");
		ss5.setKor(100);
		System.out.println("이름 : " + ss5.getName());
		System.out.println("국어 : " + ss5.getkor());

		System.out.println("===========================");

		// --------------------------------------------------------------
		// --------------------------------------------------------------

		
		
		StudentScore arr[] = new StudentScore[5];
		// 객체생성 안된다. 객체생성 시 생성자가 무조건 필요
		// 앞쪽의 StudentScore는 클래스이자 내가 만든 타입 int와 같은, arr[]배열 변수
		arr[0] = new StudentScore();
		arr[1] = new StudentScore();

		for (int i = 0; i < arr.length; i++) {
			String name[] = { "홍길동", "전우치", "강감찬", "김유신", "이순신" };
			int score[] = { 20, 40, 60, 80, 100 };
			Random r = new Random();

			// StudnetScore 클래스 객체 생성 무조건 생성자가 있어야 객체 생성
			arr[i] = new StudentScore();
			arr[i].setName(name[r.nextInt(5)]);
			arr[i].setKor(score[r.nextInt(5)]);
			arr[i].setEng(score[r.nextInt(5)]);
			arr[i].setMath(score[r.nextInt(5)]);
			arr[i].makeSum();
			arr[i].makeAvg();
			arr[i].makeHakjum();
			// System.out.println(arr[i].getName());
			arr[i].showInfo();
		}
	}

	// 내부 클래스는 퍼블릭 없어야 한다.

}
