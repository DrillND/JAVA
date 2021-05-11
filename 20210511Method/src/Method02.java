
public class Method02 {

	public static void main(String[] args) {

		method1(); // 메쏘드 호출(사용) ,메쏘드 커서 두고 F3번 and back은 화살표
		showName("d",3);
		showAge();
	}

	// 퍼블릭은 공공 클래스, 스테틱은 메인이 스테틱 영역에 존재(메모리 역영)
	// 메소드는 클래스 안에, 메인 메소드 밖에 위치

	// 메소드 안에서 또 메소드 호출 쌉가능
	public static void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("method1() 호출");
		}
		showName();
		showName("김길동", 200);
	}

	public static void showName() {
		String name = "홍길동";
		System.out.println(name);
	}

	public static void showAge() {
		System.out.println("100");
	}

	// 객체지향의 특징 : 메쏘드 오버로딩(중복정의)
	// 오버로딩 조건 : 1. 매개변수 타입이 달라야 한다. 2. 매개변수 갯수가 달라야 한다. 두 가지 조건 만족
	// 예시는 매개변수 갯수가 다르다.
	public static void showName(String name) {
		System.out.println(name);
	}

	public static void showName(String name, int age) {
		System.out.println("이름:" + name + ", 나이:" + age);
	}
	
	public static void showName(int age) {
		System.out.println("이름 : 전우치" + ", 나이:" + age);
	}
	
	
}
