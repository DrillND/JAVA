
public class Class01Car {
	 public static final String JIJUM = "동대구영업소"; //조건1
	 //추상화(전부 때려 넣지는 못하고 추상적인 필요한 정보만 제시) --> 클래스 변수
	 private String company;
	 private String color;
	 private String price;
	 private String model;
	 // ---> 인스턴트 변수
	 
	 
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	 
	
	 
}
