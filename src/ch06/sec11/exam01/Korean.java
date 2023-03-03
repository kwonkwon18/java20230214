package ch06.sec11.exam01;

public class Korean {

	// 인스턴스 fianl 필드 선언
	final String nation = "대한민국";
	final String ssn;

	// 인스턴스 필드 선언
	String name;

	// 생성자 선언
	public Korean(String ssn, String name) {
		System.out.println("Korean 객체 생성자가 실행됩니다. ");
		this.ssn = ssn;
		this.name = name;
	}

}
