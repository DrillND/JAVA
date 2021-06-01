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
		Menu m = new Menu(); // 객체생성 필수
		CarRandData rand = new CarRandData();
		CarController con = new CarController();

		// MVC 디자인 패턴(소프트웨어 뼈대 골격)

		while (true) {

			// int menu = m.mainMenu();
			// switch(menu); // 스위치 ()안에는 값이 들어간다.
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
						con.addRandCustData(m.getCount(), rand);

					}

					else if (menu == Menu.SUB_ADD_INS) {
						System.out.println("고객정보 수동입력");
						con.addCustData(m.addManualMenu());

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
				m.loginAdmin();
				break;

			case Menu.MAIN_MENU_EXIT:
				System.out.println("###프로그램 종료###");
				System.exit(0);
			}
		}
	}

}
