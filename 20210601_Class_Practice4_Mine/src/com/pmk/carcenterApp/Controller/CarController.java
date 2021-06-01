package com.pmk.carcenterApp.Controller;

import java.util.ArrayList;

import com.pmk.carcenterApp.model.Car;
import com.pmk.carcenterApp.model.CarModify;
import com.pmk.carcenterApp.model.Customer;
import com.pmk.carcenterApp.util.CarRandData;
import com.pmk.carcenterApp.view.Menu;

public class CarController {
	ArrayList<Customer> custList = new ArrayList<Customer>(); //꺽쇠 안에 제네릭 클래스 어떤 타입도 넣을 수 있다. 
	//제네릭 + 컬렉션 클래스
	// MVC 디자인 형태 Model --> Controller --> view 웹
	public void addRandCustData(Customer cust) {
		custList.add(cust);
	}

	// 오버로딩, 싱글톤 개념 : 이미 만들어진 랜덤 객체 받아와서 쓴다. (여기서 랜덤 객체 생성 안함)
	// 메써드?
	public void addRandCustData(int size, CarRandData rand) {
		for (int i =0; i<size; i++) {
			custList.add((new Customer(rand.getName(), rand.getTel(),rand.getMemCard(),rand.getBirthday(),rand.getEmail(),
					new Car(rand.getModel(),rand.getyear()),
					new CarModify(rand.getCause(),rand.getDateIN(),rand.getDateOut(),rand.getPrice()))));
		}
		
	}
	
	
	public void addCustData(Customer cust) {
		custList.add(cust);
		Menu m = new Menu();
		m.addManualMenu();
	}

	public void viewCustData() {
		for (int i = 0; i < custList.size(); i++) {
			System.out.println(custList.get(i).toString());
			
		}
		//메인이 심플하다 = 모듈화가 잘 되어 있다.
	}

}
