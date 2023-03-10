package ch09.sec04.exam01;

public class A {

	// 로컬 클래스는 생성자와 메서드가 실행될 동안에만 객체를 생성할 수 있다.

	// 생성자
	A() {

		// 로컬 클래스 선언
		class B {
		}

		// 로컬 객체 선언
		B b = new B();

	}

	// 메서드
	void method() {
		// 로컬 클래스 선언
		class B {
		}

		// 로컬 객체 선언
		B b = new B();

	}

}
