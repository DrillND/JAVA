package com.hundai.carAPP;

import java.util.ArrayList;

import com.hundai.carAPP.car.Car;
import com.hundai.carAPP.customer.Customer;
import com.hundai.carAPP.util.CarRandData;

public class CarAppMain2 {

	public static void main(String[] args) {

		Customer[] arr = new Customer[10];
		//제네릭 + 컬렉션 클래스
		ArrayList<Customer> arrList = new ArrayList<Customer>();
		//<> 제네릭 클래스
		//가변적인 배열이다. <>안에 어떤 타입도 넣을 수 있다. 커스터머 타입을 다 넣을 수 있음 선형구조. 
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
			arrList.add(arr[i]); //마지막 배열은 널을 참조, 자료구조 파트임
			System.out.println();
		}

		System.out.println("######################");
		System.out.println("ArrayList 고객 정보");
		System.out.println("######################");
		for(int i=0; i<arrList.size(); i++) {
			//Customer cuList = arrList.get(i);
			//cuList.printCustomerInfo(); == 밑이랑 같다.
			arrList.get(i).printCustomerInfo();
		}
		
		
	}
}
