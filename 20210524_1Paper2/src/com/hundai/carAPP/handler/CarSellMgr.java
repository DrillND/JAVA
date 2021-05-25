//내부 기능 코딩
package com.hundai.carAPP.handler;

import java.util.ArrayList;

import com.hundai.carAPP.car.Car;
import com.hundai.carAPP.customer.Customer;
import com.hundai.carAPP.util.CarRandData;

public class CarSellMgr {
	ArrayList<Customer> cuList = new ArrayList<Customer>();
	CarRandData r = new CarRandData();

	public void showSellInfor() {
		for (Customer cu : cuList) {
			cu.printCustomerInfo();
		}

		// for (int i =0; i<cuList.size(); i++) {
		// cuList.get(i).printCustomerInfo();
		// }
	}

	public void randInsData() {
		cuList.add(new Customer(r.getName(), r.getTel(), r.getAddress(),
				new Car(r.getModel(), r.getColor(), r.getYear(), r.getCompany())));
	}

	public void randInsData(int size) {
		for (int i = 0; i < size; i++) {
			cuList.add(new Customer(r.getName(), r.getTel(), r.getAddress(),
					new Car(r.getModel(), r.getColor(), r.getYear(), r.getCompany())));
		}
	}

	public void insData() {
		cuList.add(new Customer(null, null, null, null));
	}

	public void mainExit() {
		System.exit(0);
	}
}
