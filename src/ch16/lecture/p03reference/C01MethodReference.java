package ch16.lecture.p03reference;

public class C01MethodReference {
	public static void main(String[] args) {

		MyInterface01 o1 = a -> System.out.println(a);

		MyInterface01 o2 = a -> MyClass01.method(a);

		// method reference (스테틱 메소드 참조)
		// 파라미터의 순서가 스테틱 메소드의 참조변수 순서와 맞기만 하면 됨
		MyInterface01 o3 = MyClass01::method;
	}
}

interface MyInterface01 {
	void action(int a);
}

class MyClass01 {
	public static void method(int a) {

	}
}