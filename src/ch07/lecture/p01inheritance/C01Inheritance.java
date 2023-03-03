package ch07.lecture.p01inheritance;

public class C01Inheritance {

	public static void main(String[] args) {

		MyClass02 o1 = new MyClass02();

		// MyClass01에 기입한 내용이지만
		// MyClass02가 01을 상속받고 있으므로
		// 아래 필드와 메서드를 사용할 수 있다.
		o1.field1 = 11;
		System.out.println(o1.field1);
		o1.method1();

		o1.method2();

	}

}
