package ch09.exercise;

import ch09.exercise.Car.Tire;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // 바깥 객체 생성

		Car.Tire tire = myCar.new Tire(); // 바깐 객체 생성 후 중첩 객체 생성

		Car.Engine engine = new Car.Engine(); // static 은 상위 객체 생성 필요 없음

	}

}
