package ch13.lecture.p01generic;

public class C05GenericMethod {
	public static void main(String[] args) {

		MyClass05 o1 = new MyClass05();
		o1.<String>method("java");
		o1.<Integer>method(9);

		o1.method("spring"); // 매개변수로 인해서 타입이 정해져서 <> 안써줌
	}
}

class MyClass05 {

	// generic method

	public <T> void method(T t) {

	}
}