package com.pmk.carcenterApp;

import com.pmk.carcenterApp.Controller.CarController;
import com.pmk.carcenterApp.model.Car;
import com.pmk.carcenterApp.model.CarModify;
import com.pmk.carcenterApp.model.Customer;
import com.pmk.carcenterApp.util.CarRandData;
import com.pmk.carcenterApp.view.Menu;

public class CarCenterMain {

	public static void main(String[] args) {
		// 객체 = 엔터티(데이터베이스에서), (ex 고객, 자동차 등 하나하나의 객체)
		Menu m = new Menu();
		CarRandData rand = new CarRandData();
		CarController con = new CarController();
		
		while (true) {
			switch (m.mainMenu()) {
			case Menu.MAIN_MENU_ADD:
				/*
				 * while (true) { switch (m.addSubMenu()) { case Menu.SUB_ADD_RAND:
				 * System.out.println("고객정보 랜덤생성"); continue; case Menu.SUB_ADD_INS:
				 * System.out.println("고객정보 수동입력"); continue; case Menu.SUB_ADD_EXIT:
				 * System.out.println("메인메뉴 되돌리기"); break; } break; }
				 */
				// 플레그 변수 와일 트루 탈출
				while (true) {
					int menu = m.addSubMenu();
					if (menu == Menu.SUB_ADD_RAND) {
						System.out.println("고객정보 랜덤생성");
						con.addRandCustData((new Customer(rand.getName(), rand.getTel(),rand.getMemCard(),rand.getBirthday(),rand.getEmail(),
								new Car(rand.getModel(),rand.getyear()),
								new CarModify(rand.getCause(),rand.getDateIN(),rand.getDateOut(),rand.getPrice()))));
						
					}

					else if (menu == Menu.SUB_ADD_INS) {
						System.out.println("고객정보 수동입력");
						
						
					}

					else if (menu == Menu.SUB_ADD_EXIT) {
						System.out.println("메인메뉴 되돌리기");
						break;
					}
				}
				break;
				
			case Menu.MAIN_MENU_VIEW:
				System.out.println("고객정보 등록보기");
				con.viewCustData();
				
				break;
			case Menu.MAIN_MENU_ADMIN:
				System.out.println("관리자 모드");
				break;
			case Menu.MAIN_MENU_EXIT:
				System.out.println("###프로그램 종료###");
				System.exit(0);
			}
		}
	}

}
