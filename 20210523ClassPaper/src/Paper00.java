
public class Paper00 {
/*
[업데이트 2021.02.13]

======================================================

1. 해결 가능 언어

   - C++, Java, C#, Python, 기타 객체 지향 프로그래밍 언어



2. 해결 조건

   - 클래스, 객체와 연관된 개념들 이해



3. 특이사항

   - Python 에서는 배열 대신 리스트 적용

======================================================



1. 자동차에 대한 클래스 작성하기.

조건1) 속성(멤버 변수) - 대리점명은 상수 클래스변수(static 변수)로 선언.
조건2) 속성(멤버 변수) - 제조사, 색상, 가격, 모델명은 인스턴스 변수로 선언.
조건3) 기본 생성자를 만들고 아래의 속성값들을 초기화 바람.
      제조사 - "기아", 색상 - "블랙", 이름 - "K7"
      가격 - "사천만원", 대리점명 - "동대구 영업소"
조건4) 모든 속성들을 매개변수로 전달하여 객체를 생성할수있는 생성자 추가.
조건5) 모든 속성 정보들을 출력하는 인스턴스 메쏘드(함수) 추가.



2. 자동차 클래스 추가 작업.

조건1) main()에서 기본생성자를 사용하여 객체를 생성하고 모든 속성 정보 출력하기.
조건2) 자동차 클래스에 모델명을 설정하는 인스턴스 메쏘드 추가.
조건3) 자동차 클래스에 가격을 설정하는 인스턴스 메쏘드 추가.
조건4) 자동차 클래스에서 모델명을 가져오는 인스턴스 메쏘드 추가.
조건5) 자동차 클래스에서 가격을 가져오는 인스턴스 메쏘드 추가.
조건6) main()에서 매개변수가 있는 생성자를 사용하여 객체 생성하기.
조건7) 조건1 에서 생성한 객체를 사용하여 모든 속성 정보 출력.
조건8) 조건6 에서 생성한 객체를 사용하여 모든 속성 정보 출력.



3. 아래의 배열의 값의 합과 평균을 구하는 클래스 작성.

조건1) int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
조건2) 배열의 합과 평균을 속성으로 설정.
조건3) 배열의 합을 반환하는 인스턴스 메쏘드 추가.
조건4) 배열의 평균을 반환하는 인스턴스 메쏘드 추가.
조건5) main()에서 생성자의 매개변수로 배열 array 전달하여 객체 생성 및 합과 평균 출력.



4. 메쏘드 파트의 11번 문제를 StudentScore 클래스로 설계해보기 바람.

조건1) 각각의 속성과 메쏘드를 스스로 추상화하여 작성 바람.



5. 랜덤하게 이름을 생성하는 NameData 클래스 작성.

first[] = {"김", "박", "이", "최", "장"};
mid[] = {"가", "나", "다", "라", "마"};
last[] = {"바", "사", "아", "자", "차"};



조건1) 풀네임을 저장하는 속성 추가.
조건2) 랜덤하게 풀네임을 만들어 반환하는 메쏘드 추가.



6. NameData에서 생성한 50개의 풀네임 데이터를 파일에 저장하는 MyFileWrite 클래스 작성.

조건1) 해당경로에 D:\data\name.txt 를 생성하는 멤버 메쏘드 추가.
예제)
FileOutputStream out = new FileOutputStream(파일경로 입력);
out.write(여기에 완성된 이름정보를 넣으세요);
out.close();

조건2) 파일을 생성하여 저장할때, '/'문자를 각각의 풀네임뒤에 붙여서 저장 바람.
예제) 김가나/박나사/이가바/최나자/.........

해당 정보는 아래에서 파싱되어져야 합니다.



7. MyFileWrite클래스에서 생성한 파일의 정보를 읽어오는 MyFileRead 클래스 작성.

조건1) 파일을 읽어서 정보를 배열에 담아 출력하는 메쏘드 추가.
예제)

BufferedReader br = new BufferedReader(new FileReader(new File(파일경로 입력)));
String str = br.readLine();
br.close();

조건2) 파일의 정보를 읽을때, '/'문자는 제거하여 ArrayList 또는 배열에 저장.
      ArrayList 사용법은 책을 통하여 스스로 이해하기. 어려우면 배열 사용 바람.

조건3) '/'문자 제거를 위해서는 StringTokenizer를 사용.

예) StringTokennizer st = new StringTokenizer("홍길동/김길동", "/");
    while (st.hasMoreTokens()) {
       String temp = st.nextToken();
       System.out.println(temp);
    }

 */
}