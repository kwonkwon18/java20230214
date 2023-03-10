package ch09.lecture.p01nested;

public class C04LocalClass {

	void method1() {
		// 로컬 클래스 (local class) ==> 메서드 안에 들어가 있음
		class LocalClass01 {

		}

		LocalClass01 o1 = new LocalClass01();

	}

	void method2() {
		LocalClass01 o1 = new LocalClass01(); // xxx ==> 들어있는 로컬 클래스가 다름
	}

}
