package com.hundai.carAPP.view;
import java.util.Scanner;

public class Menu2 {
	public static final int MAIN_MENU_VIEW = 1;
	public static final int MAIN_MENU_RAND_INS = 2;
	public static final int MAIN_MENU_INS = 3;
	public static final int MAIN_MENU_EXIT = 4;
	
	Scanner s = new Scanner(System.in);
	
	public int mainMenu() {
		System.out.println("------------------------");
		System.out.println("중고차 매매 관리 프로그램 v1.0");
		System.out.println("------------------------");
		System.out.println("1.중고차 매매 현황 보기");
		System.out.println("2.중고차 매매 랜덤 자료 추가");
		System.out.println("3.중고차 매매 수동 자료 추가");
		System.out.println("4.프로그램 종료");
		System.out.println("------------------------");
		System.out.println("메인 메뉴 선택하세요 : ");
		return s.nextInt();
	}
}
