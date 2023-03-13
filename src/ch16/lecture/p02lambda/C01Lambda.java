package ch16.lecture.p02lambda;

public class C01Lambda {

	public static void main(String[] args) {
		// functional interface로 lambda 식 만들 수 있음
		MyInterface01 o1 = (/*매개변수*/) -> System.out.println("재정의 메서드 @");

		o1.method1(); // 재정의 메서드 @
		o1.method2();
		MyInterface01.method3();

		MyInterface01 o2 = (/*매개변수*/) -> System.out.println("또다른 메서드 @");
		o2.method1(); // 또다른 메서드 @
	}

}

// lambda expression
// 추상메서드가 하나인 인터페이스의 익명 클래스 객체 만드는 코드

// functional interface : 추상메서드가 하나인 인터페이스

@FunctionalInterface
interface MyInterface01 {

	void method1();

	String toString(); // object 메서드는 추상메서드 수에 포함 안됨

//	void method2(); ==> 메서드가 두개 들어가면 functional expression 이 아님 
	default void method2() {
		System.out.println("추상메서드 아님 ");
	}

	static void method3() {
		System.out.println("추상 메서드 아님");
	}
}