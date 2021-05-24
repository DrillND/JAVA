// 첫번째 자료에서 랜덤 데이터 추출을 메인에서 클래스로 떼어내는 작업하기
package com.lg.studApp.main;



import com.lg.studApp.model.Student;
import com.lg.studApp.util.RandData;

public class StudMain2 {

	public static void main(String[] args) {

		Student st[] = new Student[10];
		RandData r = new RandData();
		for (int i = 0; i < st.length; i++) {
			st[i] = new Student(r.getName(), r.getAge(), r.getGender(), r.getAddress());
			/*
			st[9].setName("전우치");
			st[9].setAge(24);
			st[9].setGender('남');
			st[9].setAddress("조선 한양인근 두메산골");
			*/
		}
		
		for (int i = 0; i < st.length; i++) {
			System.out.print(i + 1 + " ");
			st[i].showStInfo();
			System.out.println();
		}

	}

}
