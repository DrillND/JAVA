
public class Class01 {

	public static void main(String[] args) {
		Class01Car car = new Class01Car();
		//Ctrl + /
		System.out.println(Class01Car.JIJUM);
		car.setModel("K7");
		car.setCompany("기아");
		car.setColor("검정");
		car.setPrice("3천만원");
		
		System.out.println(car.toString());
		car.showCarinfo();
		
		Class01Car car2 = new Class01Car();
		Class01Car car3 = new Class01Car();
		Class01Car car4 = new Class01Car("현대","흰색","4천만원","그랜저");
		
		System.out.println(car4.toString());
		car4.showCarinfo();
		car3.showCarinfo();
		
	}

}
