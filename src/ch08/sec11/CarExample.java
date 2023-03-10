package ch08.sec11;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.run();

		System.out.println("========= 타이어 교체 ==========");

		myCar.tire1 = new HankookTire();
		myCar.tire2 = new HankookTire();

		myCar.run();
	}

}
