package com.pmk.carcenterApp.Controller;

import java.util.ArrayList;

import com.pmk.carcenterApp.model.Car;
import com.pmk.carcenterApp.model.CarModify;
import com.pmk.carcenterApp.model.Customer;

public class CarController {
	ArrayList<Customer> custList = new ArrayList<Customer>();
	// MVC 디자인 형태 Model --> Controller --> view 웹
	public void addRandCustData(Customer cust) {
		custList.add(cust);
	}

	public void addCustData(Customer cust) {
		custList.add(cust);
	}

	public void viewCustData() {
		for (int i = 0; i < custList.size(); i++) {
			System.out.println(custList.get(i).toString());
			
		}
		
	}

}
