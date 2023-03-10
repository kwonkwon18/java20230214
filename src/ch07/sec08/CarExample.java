package ch07.sec08;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();

		// Tire 객체 장착(필드에)
		myCar.tire = new Tire();
		myCar.run(); // 회전합니다.

		// HankookTire 객체 장착(필드에)
		myCar.tire = new HankookTire();
		myCar.run(); // 한국 타이어가 회전합니다.

		// KumhoTire 객체 장착 (필드에)
		myCar.tire = new KumhoTire();
		myCar.run(); // 금호 타이어가 회전합니다.

	}

}
