package ch06.lecture.p03method;

public class MyClass09 {

//	void method1() {
//		System.out.println("파라미터 없는 메서드");
//	}
//
//	void method1(int i) {
//		System.out.println("정수 파라미터 하나 받는 메서드");
//	}
//
//	void method1(int i, int k) {
//		System.out.println("정수파라미터 두개 받는 메서드");
//	}
//
//	void method2(int[] args) {
//		for (int arg : args) {
//			System.out.println("받은 파라미터 : " + arg);
//		}
//	}

	// 가변길이 아규먼트 (varargs)
	// 가변길이는 배열타입으로 들어가게 됨, 따라서 향상된 for 문과 같은 것으로 arg[i] 이렇게 추출해줘야함.
	void method3(int... args) {
		for (int arg : args) {
			System.out.println("가변길이 파라미터 " + arg);
		}
	}

	// 가변길이 매개변수는 파라미터 목록에서 가장 오른쪽에 작성해야함
	void method4(String param, double d, int... values) {

	}
}
