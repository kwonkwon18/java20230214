package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {

		SmartPhone smartphone = new SmartPhone("홍길동");

		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();

		Phone p = smartphone;
		p.turnOn();
		p.turnOff();

	}

}
