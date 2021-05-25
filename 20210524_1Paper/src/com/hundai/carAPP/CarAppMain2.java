package com.hundai.carAPP;

import com.hundai.carAPP.car.Car;
import com.hundai.carAPP.customer.Customer;
import com.hundai.carAPP.util.CarRandData;

public class CarAppMain2 {

	public static void main(String[] args) {

		Customer[] arr = new Customer[10];
		CarRandData c = new CarRandData();
		
		//arr[0] = new Customer(c.getName(),c.getTel(),c.getAddress(),
				//new Car(c.getModel(),c.getColor(),c.getYear(),c.getCompany()));
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Customer(c.getName(), c.getTel(), c.getAddress(),
					new Car(c.getModel(), c.getColor(), c.getYear(), c.getCompany()));

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + " ");
			arr[i].printCustomerInfo();
			System.out.println();
		}

	}
}
