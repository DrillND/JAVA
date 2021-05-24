/*
1. 학생관리 프로그램을 위한 학생(Student) 클래스 설계.

조건01) 프로젝트를 생성할때 패키지명을 com.(회사명 또는 본인 이니셜).앱이름으로 생성.
조건02) 학생 클래스, main()를 포함하는 클래스 2개 사용. (java파일 총 2개 생성)
조건03) 클래스의 속성은 이름, 나이, 성별, 주소를 선언하고 다른 클래스에서 접근을 차단함.
       - 속성의 데이터 타입은 아래의 조건7을 참고 바람.
조건04) 매개변수 이름, 나이, 성별, 주소를 사용하는 생성자 추가.
조건05) 속성에 대한 getter/setter 멤버 메쏘드 추가.
조건06) 모든 속성 정보를 출력하는 showStudentInfo() 멤버 메쏘드 추가.
조건07) main()에서 다음의 학생 정보 배열 초기화.

 String name[] = {"홍길동", "김길동", "박길동", "이길동", 최길동"};
        int age[] = {20, 25, 30, 35, 40};
        char gender[] = {'남', '여'};
        String address[] = {"대구시 동구 신암4동", "서울시 동구 신암4동",
 "부산시 동구 신암4동", "인천시 동구 신암4동", "광주시 동구 신암4동"};

조건08) main()에서 10명의 학생 정보를 저장할수있는 Student 객체 생성.
조건09) 이름, 나이, 성별, 주소 정보들을 랜덤하게 가져와 생성자 매개변수로 전달하기.
조건10) 10명의 학생정보가 생성되었으면 showStudentInfo()를 통해서 모두 출력하기.
       - 출력 형태는 깔끔하게 정리하여 보여주기.
조건11) 10번째 학생의 정보를 아래의 정보로 변경하기.

 "전우치", 24, '남', "조선 한양인근 두메산골"
       
조건12) 조건11 에서 설정한 정보들을 showStudentInfo() 를 통해서 출력.
 */
package com.lg.studApp.model;

public class Student {
	// 무조건 변수부터 생각한다.
	// 여기서는 패키지가 분리되어있어서 프라이빗 안해도 디폴드값이 프라이빗임
	private String name;
	private int age;
	private char gender;
	private String address;
	
	
	
	//조건4번	
	//소스에서 이클립스 자동생성기능을 사용해서 만들어라 쓰지말고. Constructor
	public Student(String name, int age, char gender, String address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	//이것도 소스에서 override, 여기서는 안쓰였다. 밑에 것과 같은 기능
	@Override
	public String toString() {
		String str = "이름: "+name+"\n";
		str += "성별: "+gender+"\n";
		str += "나이: "+age+"\n";
		str += "주소: "+address+"\n";
		return str;
	}


// 조건6번까지
	public void showStInfo() {
		System.out.println("이름: "+name);
		System.out.println("성별: "+gender);
		System.out.println("나이: "+age);
		System.out.println("주소: "+address);
	}
}
