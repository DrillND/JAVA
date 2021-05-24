
public class Class02Car {
	public static final String JIJUM = "동대구영업소"; //조건1
	 //추상화(전부 때려 넣지는 못하고 추상적인 필요한 정보만 제시) --> 클래스 변수
	private String company;
	private String color;
	private String price;
	private String model;
	 // ---> 인스턴트 변수
	 
	public Class02Car() {
		company = "기아";
		color = "블랙";
		model = "K7";
		price = "사천만원"; 
	 }
	
	//생성자 오버로딩
	public Class02Car(String company, String color, String price, String model) {
		super();
		this.company = company;
		this.color = color;
		this.price = price;
		this.model = model;
	}
	
	 
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	// 오버로딩 : 중복 정의 (변수 갯수,타입만 다르게)
	// 오버라이딩 : 재정의
	// @=어노테이션, 컴파일러에게 어떤 역할은 한다고 알려줌. 
	@Override
	public String toString() {
		String str = "모델 : " + model + "\n";
		str += "색상 : " + color + "\n";
		str += "가격 : " + price + "\n";
		str += "제조사 : " + company + "\n";
		str += "대리점 : " + JIJUM + "\n";
		//return super.toString(); //부모쪽으로
		return str;
	}
	 
	public void showCarinfo() {
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("제조사 : " + company);
		System.out.println("대리점 : " + JIJUM);
	}
	 
}
