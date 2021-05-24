package com.lg.studApp.util;

import java.util.Random;
//클래스는 객체를 생성해야 된다. 
public class RandData {
	String name[] = {"홍길동", "김길동", "박길동", "최길동", "이길동"};
	int age[] = {20, 25, 30, 35, 40};
    char gender[] = {'남', '여'};
    String address[] = {"대구시 동구 신암4동", "서울시 동구 신암4동","부산시 동구 신암4동", 
    		"인천시 동구 신암4동", "광주시 동구 신암4동"};
    
    Random r = new Random();
    
    public String getName() {
    	return name[r.nextInt(5)];
    }
    
    public int getAge() {
    	return age[r.nextInt(5)];
    }
    
    public char getGender() {
    	return gender[r.nextInt(2)];
    }
    
    public String getAddress() {
    	return address[r.nextInt(5)];
    }
    
	
}
