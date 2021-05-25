package com.hundai.carAPP.car;

public class Car {
	private String model;
	private String color;
	private int year;
	private String company;
	
	//툴을 이용
	public Car(String model, String color, int year, String company) {
		super(); //부모 생성자, 부모의 위치를 가르킨다.
		this.model = model;
		this.color = color;
		this.year = year;
		this.company = company;
	}

	//툴을 이용
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}
	
	public void printCarInfo() {
		System.out.println("모델명 : "+model);
		System.out.println("색상 : "+color);
		System.out.println("연식 : "+year);
		System.out.println("제조사 : "+company);
	}
	
	//리소스에서 오버라이드, 투스트링 체크
	@Override
	public String toString() {
		
		return super.toString();
	}

	
	
	
	
}
