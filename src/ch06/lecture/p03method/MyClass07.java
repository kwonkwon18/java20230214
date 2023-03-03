package ch06.lecture.p03method;

public class MyClass07 {

	// 파라미터 개수, 순서, 타입에 맞게
	// 아규먼트를 전달해야함

	// 메서드 오버로딩(method overloading)
	// 메서드 이름이 같아도
	// 파라미터 개수, 순서, 타입이 다르면
	// 다른 메서드임

	// 같은 이름을 가진 메서드지만 서로 다른 메서드이다.
	void method1(int i) {
		System.out.println("정수 하나 받는 메서드 ");
	}

	void method1(long i) {
		System.out.println("long 하나 받는 메서드 ");
	}
	
	void method(int i , int j) {
		System.out.println("정수 두개 받는 메서드 ");
	}
	
	
	// 순서가 달라도 다른 메서드 
	void method(String i , int j) {
		System.out.println("문자열 하나 정수 하나 받는 메서드 ");
	}
	
	void method(int j, String i) {
		System.out.println("문자열 하나 정수 하나 받는 메서드 ");
	}
	
	
}
