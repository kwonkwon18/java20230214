package ch06.lecture.p03method;

public class C04Parameter {

	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04();

		o1.method1();

		// 메서드 실행 시 정의된 파라미터 타입과 순서, 개수에 맞춰서
		// 아규먼트 입력(전달)
//		o1.method1(3); 파라미터가 없는건 파라미터를 넣으면 안된다. 

		o1.method2(3); // 인티저 파라미터 하나 받는 메서드

		o1.method3("kwonkwon"); // 스트링 파라미터 하나 받는 메서드

		String s1 = "java";

		o1.method3(s1); // 스트링 파라미터 하나 받는 메서드

		o1.method3(null); // 스트링 파라미터 하나 받는 메서드 ==> null 도 된다.

		o1.method4(4, 2); // 정수 파라미터 2개 받는 메서드

		o1.method5(4, s1); // 정수 1개 문자열 하나씩 받는 메서드

	}

}
