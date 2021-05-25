package com.hundai.carAPP;

import com.hundai.carAPP.view.Menu2;

public class CarAppMain2 {

	public static void main(String[] args) {
		Menu2 m = new Menu2();
		while(true) {
			switch (m.mainMenu()){
				case 1:
					System.out.println("중고차 매매 현황 보기");
					break;
				case 2:
					System.out.println("중고차 매매 랜덤 자료 추가");
					break;
				case 3:
					System.out.println("중고차 매매 수동 자료 추가");
					break;
				case 4 :
					System.out.println("프로그램 종료");
					System.exit(0);
			}
			
		}
	}

}
