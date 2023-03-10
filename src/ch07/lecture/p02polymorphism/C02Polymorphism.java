package ch07.lecture.p02polymorphism;

public class C02Polymorphism {
	public static void main(String[] args) {

		// 하위 클래스의 인스턴스는 상위 클래스의 인스턴스이다.

		SubClass01 o1 = new SubClass01();

		SuperClass01 o2 = o1; // 자동 형변환

		// 아래 두 메서드는 같은 메서드
		o2.method1();
		o1.method1();

	}
}

class SuperClass01 {
	public void method1() {
		System.out.println("super method1");
	}
}

class SubClass01 extends SuperClass01 {

}
