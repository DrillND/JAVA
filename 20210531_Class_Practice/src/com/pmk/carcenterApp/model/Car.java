package com.pmk.carcenterApp.model;

//고장난 차
public class Car {
	private String model; // 차량 모델
	private String year; // 차량 연식
	// 원래는 순수하게 차에대한 정보만 클래스로 구성하고, 다른 고장원인 같은 것은 따로 클래스 생성해야된다.
	
	
	
	public Car(String model, String year) {
		super();
		this.model = model;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override // 오버라이드
	public String toString() {
		String str = "수리차량 : " + model + "\n";
		str += "연식: " + year + "\n";
		return str;
	}

	

}
