package ch16.lecture.p02lambda;

public class C03Lambda {
	public static void main(String[] args) {

		MyInterface03 o1 = new MyInterface03() {
			@Override
			public void method(int a) {
				System.out.println("익명 클래스로 재정의");
				System.out.println("받은 값 : " + a);
			}
		};
		o1.method(3);

		MyInterface03 o2 = (int a) -> {
			System.out.println("람다로 재정의");
			System.out.println("받은 값 : " + a);
		};
		o2.method(5);

		MyInterface03 o3 = (x) -> {
			System.out.println("파라미터 타입 생략");
			System.out.println("받은 값 : " + x);
		};
		o3.method(20);

		// 파라미터가 하나일 때는 괄호랑 타입을 생략할 수 있다.
		MyInterface03 o4 = b -> {
			System.out.println("파라미터 타입과 괄호 생략");
			System.out.println("받은 값 : " + b);
		};
		o4.method(60);
	}
}

interface MyInterface03 {
	void method(int a);
}
