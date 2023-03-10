package ch08.sec11;

public class Car {
	// 필드
	Tire tire1 = new KumhoTire();
	Tire tire2 = new KumhoTire();

	// 메서드
	void run() {
		tire1.roll();
		tire2.roll();
	}

}
