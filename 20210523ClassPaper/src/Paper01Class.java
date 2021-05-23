
public class Paper01Class {
	private String company;
	private String color;
	private String price;
	private String name;
	
	public static final String derijum = "동대구 영업소";
	
	
	public Paper01Class() {
		company = "기아";
		color = "블랙";
		name = "K7";
		price = "사천만원";
		
	}
	
	public Paper01Class(String company, String color, String price, String name) {
		super();
		this.company = company;
		this.color = color;
		this.price = price;
		this.name = name;
	}
}
