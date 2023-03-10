package ch09.lecture.p02anonymous;

public class C03Anonymous {
	public static void main(String[] args) {

		// 내가 어떤 클래스를 구현을 하는데, 딱히 다른 클래스를 만들고 싶지는 않아
		// 이런 상황에서 상속을 통해서 메서드를 오버라이딩해서 사용하고 싶을 때
		// 즉 기존의 메서드는 놨두고 특성 상황에서 오버라이딩 된 메서드를 클래스 추가 없이 쓰고 싶을 때

		MyClass03 o1 = new MyClass03() {
			@Override
			void method1() {
				System.out.println("재정의한 메서드 ");
			}
		};
		o1.method1();
	}
}

abstract class MyClass03 {

	abstract void method1();

}