package com.hundai.carAPP;

import java.util.Scanner;

import com.hundai.carAPP.handler.CarSellMgr;
import com.hundai.carAPP.view.Menu2;

public class CarAppMain2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Menu2 m = new Menu2(s); //싱글톤 개념
		CarSellMgr cs = new CarSellMgr();
		//객체생성
		while(true) {
			switch (m.mainMenu()){
				case Menu2.MAIN_MENU_VIEW:
					cs.showSellInfor();
					//System.out.println("중고차 매매 현황 보기");
					break;
				case Menu2.MAIN_MENU_RAND_INS:
					cs.randInsData(m.getRandCnt());
					//System.out.println("중고차 매매 랜덤 자료 추가");
					break;
				case 3:
					System.out.println("중고차 매매 수동 자료 추가");
					cs.insData();
					break;
				case 4 :
					//System.out.println("프로그램 종료");
					//System.exit(0);
					cs.mainExit();
				default:
					System.out.println("올바른 메뉴를 다시 선택하세요.");
					break;
			}
			
		}
	}

}
