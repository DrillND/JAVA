package com.hundai.carAPP.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu2 {
	public static final int MAIN_MENU_VIEW = 1;
	public static final int MAIN_MENU_RAND_INS = 2;
	public static final int MAIN_MENU_INS = 3;
	public static final int MAIN_MENU_EXIT = 4;
	Scanner s;
	
	public Menu2(Scanner s) {
		this.s = s;
	}
	

	public int mainMenu() {
		int menu = 0;
		try {
			System.out.println("------------------------");
			System.out.println("중고차 매매 관리 프로그램 v1.0");
			System.out.println("------------------------");
			System.out.println("1.중고차 매매 현황 보기");
			System.out.println("2.중고차 매매 랜덤 자료 추가");
			System.out.println("3.중고차 매매 수동 자료 추가");
			System.out.println("4.프로그램 종료");
			System.out.println("------------------------");
			System.out.println("메인 메뉴 선택하세요 : ");
			menu = s.nextInt();
			
		} catch (InputMismatchException e) {
			System.out.println("###숫자정보를 다시 입력하세요###");
			s.next(); //강제로 스캐너 동작
		}
		return menu;
	}

	public int getRandCnt() {
		int menu = 0;
		try {
			System.out.println("------------------------");
			System.out.println("랜덤하게 생성할 개수 입력 화면");
			System.out.println("------------------------");
			System.out.println("개수를 입력하세요 : ");
			menu = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("###숫자정보를 다시 입력하세요###");
			s.next();
		}
		return menu;
	}
}
