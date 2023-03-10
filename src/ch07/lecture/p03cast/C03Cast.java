package ch07.lecture.p03cast;

public class C03Cast {

	public static void main(String[] args) {
		method1(new Animal()); // 가능
		method1(new Horse()); // 가능
		method1(new Fish()); // 가능

		System.out.println("실행흐름 이어감 ");

	}

	public static void method1(Animal a) {
		a.breath();
//		호흡한다. 
//		폐 호흡한다. 
//		아가미 호흡한다.

		// 만약 말 객체이면 실행
		if (a instanceof Horse) {
			Horse h = (Horse) a;
			h.run(); // 달리다
		}

//		Horse h = (Horse) a; ==> 안되는 코드 ! 애니멀은 홀스다.. 피쉬는 홀스다... 이런거 안됨
//		h.run();
	}

}
