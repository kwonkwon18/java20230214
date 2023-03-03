package ch06.lecture.p07constructor;

public class MyClass07 {

	// 필드
	String name;
	int age;

	// 생성자 오버로딩
	// 파라미터 순서, 타입, 개수에 따라 생성자 여러개 만들 수 있음
	MyClass07(String name, int age) {
		System.out.println("파라미터를 받는 생성자 호출");
		this.name = name;
		this.age = age;
	}

	// 오버로딩
	MyClass07() {
		System.out.println("기본생성자 호출");
	}

	// 메서드

}
