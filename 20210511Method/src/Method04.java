
public class Method04 {

	public static void main(String[] args) {
		// 3번째 리턴 타입
		System.out.println("나이:" + getAge());
		System.out.println("이름:" + getName());
		System.out.println("나이:" + getAge(100));
		System.out.println("이름:" + getName("최"));
	}
	
	public static int getAge() {
		int age = 100;
		return age;
	}
	
	public static String getName() {
		String name = "홍길동";
		return name;
	}
	
	public static int getAge(int age) {
		return age + 100;
	}
	
	public static String getName(String lastName) {
		return lastName + "길동";
	}
}
