package ch07.sec03;

public class SmartPhone extends Phone {

	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("sub 생성자 실행됨");
	}
}