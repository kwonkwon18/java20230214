package ch06.lecture.p10access;

public class MyClass01 {
	// 접근 제한자
	// public : 외부에서도 접근 가능
	// private : 같은 클래스 안에서만 접근 가능

	// 필드
	public String name;
	private int age;

	// 메서드

	public void method1() {
		System.out.println("메서드 1");
	}

	private void method2() {
		System.out.println("메서드 2");
	}

	private void method3() {
		System.out.println(age); // 접근 가능함.
	}

	private void method4() {
		method2();
		method3();
	}

}
