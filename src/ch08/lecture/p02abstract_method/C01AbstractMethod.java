package ch08.lecture.p02abstract_method;

public class C01AbstractMethod {
	public static void main(String[] args) {
		
		MyClass01 o1 = new MyClass01();
		MyInterface01 o2 = o1;

		// -==> 한번에 작성

		MyInterface01 o3 = new MyClass01();

		System.out.println(System.identityHashCode(o1)); // 682376643
		System.out.println(System.identityHashCode(o2)); // 682376643
		System.out.println(System.identityHashCode(o3)); // 854507466

		// 두개 다 실행 가능
		o1.method1(); // 구현 메서드
		o1.method2(); // 추가된 메서드

		// 실제 인스턴스에서 가지고 있는 메서드 한개만 실행 가능(오버라이딩된) (자동 형변환)
		o2.method1(); // 구현 메서드

		// 실제 인스턴스에서 가지고 있는 메서드 한개만 실행 가능(오버라이딩된) (자동 형변환)
		o3.method1(); // 구현 메서드

	}
}
