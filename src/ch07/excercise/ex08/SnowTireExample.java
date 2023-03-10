package ch07.excercise.ex08;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowtire = new SnowTire();

		Tire tire = snowtire;

		snowtire.run(); // 스노우 타이어가 굴러갑니다.
		tire.run(); // 스노우 타이어가 굴러갑니다.

	}

}
