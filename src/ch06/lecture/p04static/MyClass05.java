package ch06.lecture.p04static;

public class MyClass05 {

	// instance field
	String name;

	// static field
	static String model;

	// instance method
	void printName() {
		System.out.println(name);
		System.out.println(model); // 가능함 ! 인스턴스에서 스테틱에 접근하는 것
	}

	// static method
	static void pritModel() {
		System.out.println(model);
//		System.out.println(name); ==> 불가능함 ! 스테틱에서 인스턴스에 접근하는 것
	}

}
