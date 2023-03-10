package ch09.exercise;

public class Car {
	class Tire {

		Tire() {
			System.out.println("타이어 생성자 실행");
		}
	}

	static class Engine {
		Engine() {

			System.out.println("엔진 생성자 실행");
		}
	}

}
