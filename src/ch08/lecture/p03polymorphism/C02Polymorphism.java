package ch08.lecture.p03polymorphism;

public class C02Polymorphism {
	public static void main(String[] args) {

		method(new MyClass01()); // 가능함 , MyClass01은 MyInterface01을 상속받기 때문
		method(new MyClass02()); // 가능함 , MyClass02은 MyInterface01을 상속받기 때문

	}

	public static void method(MyInterface01 param) {
		// param의 메서드 실행 가능
	}

}
