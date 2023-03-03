package ch06.lecture.p10access.package1;

public class MyClass02 {

	// field
	public String name;
	private int age;

	// default 접근 제한자
	boolean married;

	// method
	public void method1() {
		System.out.println("공개 메서드 ");
	}

	public void method2() {
		System.out.println("공개 메서드 ");
	}

	// default 접근 제한자
	void method3() {
		System.out.println("기본 접근제한자 메서드 ");
	}
}
