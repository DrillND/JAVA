package com.pmk.carcenterApp.view;

import java.util.Scanner;

public class Menu {
	public static final int MAIN_MENU_ADD = 1;
	public static final int MAIN_MENU_VIEW = 2;
	public static final int MAIN_MENU_ADMIN = 3;
	public static final int MAIN_MENU_EXIT = 4;
	
	public static final int SUB_ADD_RAND = 1;
	public static final int SUB_ADD_INS = 2;
	public static final int SUB_ADD_EXIT = 3;
	
	
	
	Scanner s = new Scanner(System.in);
	
	public int mainMenu() {
		System.out.println("----------------------");
		System.out.println("카센터 관리 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("1. 고객정보등록");
		System.out.println("2. 고객정보보기");
		System.out.println("3. 관리자 모드");
		System.out.println("4. 프로그램 종료");
		System.out.println("-----------------------");
		System.out.print("메인메뉴 선택 : ");
		return s.nextInt();
		
		
	}
	
	public int addSubMenu() {
		System.out.println("----------------------");
		System.out.println("카센터 관리 프로그램 v1.0");
		System.out.println("-----------------------");
		System.out.println("1. 고객정보 자동 생성");
		System.out.println("2. 고객정보 수동 생성");
		System.out.println("3. 메인메뉴 이동");
		System.out.println("-----------------------");
		System.out.print("메뉴 선택 : ");
		return s.nextInt();
		
	}
	
	public void addManualMenu() {
		System.out.println("----------------------");
		System.out.println("## 고객등록정보 입력 ##");
		System.out.println("----------------------");
		System.out.print("고객명 : ");
		String name = s.next();
		System.out.print("전화 : ");
		String tel = s.next();
		System.out.print("맴버십카드 보유(Y:true,N:false) : ");
		boolean mcard = s.nextBoolean();
		System.out.print("생일 : ");
		String birthday = s.next();
		System.out.print("이메일 : ");
		String email = s.next();
		
		System.out.print("차량모델(k7,그랜저) : ");
		String model = s.next();
		System.out.print("연식(2020년식) : ");
		String year = s.next();
		
		System.out.print("수리내역 : ");
		String cause = s.next();
		System.out.print("접수날짜 : ");
		int dateIn = s.nextInt();
		System.out.print("수리예정날짜 : ");
		int dateOut = s.nextInt();
		System.out.print("수리비 : ");
		int price = s.nextInt();
		
	}
}
