package ch06.lecture.p07constructor;

public class MyClass06 {
	// 필드
	String name;
	int age;

	// 생성자 (기본생성자 아님!)
	MyClass06(String name, int age) {
		System.out.println("생성자 호출");
		this.name = name;
		this.age = age;
	}

}
