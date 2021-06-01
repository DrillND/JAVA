package com.pmk.carcenterApp.Controller;

import java.util.ArrayList;

import com.pmk.carcenterApp.model.Car;
import com.pmk.carcenterApp.model.CarModify;
import com.pmk.carcenterApp.model.Customer;
import com.pmk.carcenterApp.util.Admin;
import com.pmk.carcenterApp.util.CarRandData;
import com.pmk.carcenterApp.view.Menu;

public class CarController {
	Menu m;
	ArrayList<Customer> custList = new ArrayList<Customer>(); // 꺽쇠 안에 제네릭 클래스 어떤 타입도 넣을 수 있다.
	// 제네릭 + 컬렉션 클래스
	// MVC 디자인 형태 Model --> Controller --> view 웹

	public void addRandCustData(Customer cust) {
		custList.add(cust);
	}

	public CarController(Menu m) {
		this.m = m;
	}

	// 오버로딩, 싱글톤 개념 : 이미 만들어진 랜덤 객체 받아와서 쓴다. (여기서 랜덤 객체 생성 안함)
	// 메써드?
	public void addRandCustData(int size, CarRandData rand) {
		for (int i = 0; i < size; i++) {
			custList.add((new Customer(rand.getName(), rand.getTel(), rand.getMemCard(), rand.getBirthday(),
					rand.getEmail(), new Car(rand.getModel(), rand.getyear()),
					new CarModify(rand.getCause(), rand.getDateIN(), rand.getDateOut(), rand.getPrice(),rand.isFix()))));
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
		// 메인이 심플하다 = 모듈화가 잘 되어 있다.
	}

	public void doAddWork(Menu m, CarRandData rand) { // 객체 연결 , 메소드 편 참고
		while (true) {
			int menu = m.addSubMenu();
			if (menu == Menu.SUB_ADD_RAND) {
				System.out.println("고객정보 랜덤생성");
				addRandCustData(m.getCount(), rand);

			}

			else if (menu == Menu.SUB_ADD_INS) {
				System.out.println("고객정보 수동입력");
				addCustData(m.addManualMenu());

			}

			else if (menu == Menu.SUB_ADD_EXIT) {
				System.out.println("메인메뉴 되돌리기");
				break;
			}
		}
	}

	public boolean doAdminLogin(Menu m) {
		while (true) {
			String info[] = m.loginAdmin();
			if (info[0].equals(Admin.ADMIN_ID) == false) {
				System.out.println("잘못된 ID입니다.");
				continue;
			} else if (info[1].equals(Admin.ADMIN_PASSWD) == false) {
				System.out.println("잘못된 PASSWD입니다.");
				continue;
			} else
				return true;

		}
	}

	public void doAdminWork(Menu m) {
		for (;;) {
			int menu = m.adminMenu();
			if (menu == 1) {
				System.out.println("일일 매출합계");
			} else if (menu == 2) {
				System.out.println("차량수리 내역보기");
			} else if (menu == 3) {
				break;
			}
		}
	}

	public void doAdminWork() {
		for (;;) {
			int menu = m.adminMenu();
			if (menu == 1) {
				System.out.println("일일 매출합계 : " + dayOfSell());
				
			} else if (menu == 2) {
				System.out.println("차량수리 내역보기");
			} else if (menu == 3) {
				break;
			}
		}
	}

	public int dayOfSell() {
		int sum = 0;
		for (int i=0; i<custList.size(); i++) {
			sum += custList.get(i).getCarModify().getPrice();
		}
		return sum;
		//return CommUtil.getKoreaMoney(sum); 위에 스트링으로
	}

	public void showFixList() {
		// 이름,전화번호, 차종, 수리완료여부, 수리비용
		//수리 미완료 정보
	}
}
