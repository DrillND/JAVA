//파일 따로 만드는 것은 퍼블릭 필요
public class StudentScore {
	// 학생 한 명에 대한, 구조체?
	// 여러가지 변수를 사용가능
	// 클래스 자체가 하나의 타입, 사용자 정의 타입
	// private String name; 클래스 내부에서만 접근 가능
	// public int kor;
	// 인스턴스 변수 ,스테틱이 없는 놈들
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int sum;
	private int avg;
	private char hakjum;

	// 외부에 노출이 되지 않는 캡슐화, 정보은닉 변수 접근 제어를 막는다.

	// 인스턴스 메소드
	public void setName(String name) {
		// 외부에서 정보를 받기 위해 매개변수 네임
		// name = name; //둘다 셋네임 안에 네임을 가르키게 된다.
		this.name = name; // this 객체의 자기자신의 시작 정보(this 붙은 변수는 인스턴스 변수)
	}

	public String getName() {
		return name; // this.name 생략가능
	}

	// set get 세터 게터 관습적으로 쓴다.

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getkor() {
		return kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public char getHakjum() {
		return hakjum;
	}

	public void setHakjum(char hakjum) {
		this.hakjum = hakjum;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hakjum);
		System.out.println("-----------------");

	}
	
	
	
	//점수가 확보가 되어야 된다.  
	public void makeSum() {
		//sum = kor + eng + math;
		setSum(kor + eng + math);
	}
	
	public void makeAvg() {
		avg = sum/3;
		//setAvg(sum/3);
	}
	
	public void makeHakjum() {
		if (avg > 90 && avg <=100) {
			hakjum = 'A';
		}
		else if (avg >=80 && avg <=89) {
			hakjum = 'B';
		}
		else if (avg >=70 && avg <=79) {
			hakjum = 'C';
		}
		else if (avg >=60 && avg <=79) {
			hakjum = 'D';
		}
		else {
			hakjum = 'F';
		}
		
	}

}

//접근 지정자 
/*
 * public : 외부 어디에서든 접근 가능 private : 클래스 내부에서만 접근 가능 protected : 상속받은 클래스에서만 접근
 * 가능 default : 같은 패키지 내부에서 접근 가능
 */
// 메소드는 퍼블릭 변수는 프라이빗