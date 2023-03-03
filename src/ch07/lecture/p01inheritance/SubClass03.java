package ch07.lecture.p01inheritance;

public class SubClass03 extends SuperClass03 {

	// 메서드1, 2 상속받음

	// 상속 받은 메서드는 재정의 가능
	public void method2() {
		System.out.println("재정의한 메서드 2");
	}

	SubClass03() {
		System.out.println("서브 클래스 생성자 호출");
	}

	public void method3() {
		System.out.println("서브클래스 메서드 3");
	}

}
