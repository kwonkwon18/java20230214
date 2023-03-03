package ch06.lecture.p07constructor;

public class MyClass08 {

	// field
	String name;
	int age;
	String birthDate;
	boolean married;

	// constructor
	MyClass08(String name, int age, String birthDate, boolean married) {
		// 생성자 1 ==> 모든 필드를 파라미터로 받는다.
		System.out.println("생성자 1 호출");
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
		this.married = married;
	}

	MyClass08(String name, int age, boolean married) {
		// 생성자 2 ==> 필요한 필드만 추려서 파라미터로 받는다.
		System.out.println("생성자 2 호출");
		this.name = name;
		this.age = age;
		this.married = married;
	}
}
