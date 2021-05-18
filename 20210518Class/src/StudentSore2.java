
public class StudentSore2 {
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int sum;
	private int avg;
	private char hakjum;
	//Source - generate getter setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public char getHakjum() {
		return hakjum;
	}
	public void setHakjum(char hakjum) {
		this.hakjum = hakjum;
	}
	
	public void showInfo() {
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+hakjum);
		
		
	}
}
