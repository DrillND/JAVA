// 첫번째 자료에서 랜덤 데이터 추출을 메인에서 클래스로 떼어내는 작업하기
package com.lg.studApp.main;

// 클래스를 이용하기 위해서는 무조건 객체 생성

import com.lg.studApp.model.Student;
import com.lg.studApp.util.RandData;

// 소스코드 인스펙션 정적분석, 메인부터 분석
public class StudMain2 {

	public static void main(String[] args) {

		Student st[] = new Student[10];
		RandData r = new RandData();
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student(r.getName(), r.getAge(), r.getGender(), 
					r.getAddress());
			/*
			st[9].setName("전우치");
			st[9].setAge(24);
			st[9].setGender('남');
			st[9].setAddress("조선 한양인근 두메산골");
			죽는 이유 : 배열의 9 쯕, 즉 10번째에 값이 아직 없는데 (객체가 없는데) 객체가 있는 것 처럼 
			바꿀려고 해서, 오류 메세지 읽는 법 익혀야한다. 
			*/
			//st[9] = new Student("전우치",24,'남',"조선 한양인근 두메산골");
			//==>이거는 실행 되기는 됨 배열의 마지막에 전우치가 10개 만들어짐. 결국 제일 마지막 놈이 연결됨.(객체는 살아있다. 나머지 것들은 남아 있긴함)
		}
		
		for (int i = 0; i < st.length; i++) {
			System.out.print(i + 1 + " ");
			st[i].showStInfo();
			System.out.println();
		}

	}

}
