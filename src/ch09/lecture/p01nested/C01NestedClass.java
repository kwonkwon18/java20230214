package ch09.lecture.p01nested;

public class C01NestedClass {
	public static void main(String[] args) {
		// 인스턴스를 먼저 만들고
		MyClass01 o1 = new MyClass01();

		// 중첩 클래스 인스턴스 만들기
		MyClass01.Nested01 o2 = o1.new Nested01();
	}

}

// 중첩 클래스 (nested class)
class MyClass01 {
	// class
	class Nested01 {
		// 필드

		// 생성자

		// 메서드

	}

	// 필드

	// 생성자

	// 메서드

}
