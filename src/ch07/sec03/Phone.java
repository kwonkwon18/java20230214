package ch07.sec03;

public class Phone {

	// 필드 선언
	public String model;
	public String color;

	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("매개변수 갖는 super 생성자 실행 ");
	}

	
}
