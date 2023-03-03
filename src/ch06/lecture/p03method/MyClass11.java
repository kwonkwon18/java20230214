package ch06.lecture.p03method;

public class MyClass11 {

	void method1() {
		System.out.println("실행문 1");
		System.out.println("실행문 2");

		return; // 메서드 종료 , 이후의 실행문은 실행되지 않음

//		System.out.println("실행되지 않음");

	}

	void method2() {
		System.out.println(1);

		if (true) {
			return; // 메서드를 종료함
		}

		System.out.println(2); // 리턴문 아래에 있으므로 실행되지 않음
	}

}
