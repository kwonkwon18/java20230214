package ch06.lecture.p07constructor;

public class MyClass11 {

	final String name = "son";
	final int age;

	// 파이널 필드가 선언만 됐다면
	// 생성자에서 그 파이널 필드의 값을 초기화해줘야한다.
	MyClass11() {
		age = 99;
	}

	MyClass11(int age) {
		this.age = age;
	}

}
