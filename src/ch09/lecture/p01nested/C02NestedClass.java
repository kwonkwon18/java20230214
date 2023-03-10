package ch09.lecture.p01nested;

public class C02NestedClass {

}

class MyClass02 {
	class Nested02 {

	}
	
	// 전체클래스 안에서 중첩 클래스 타입을 사용할 수 있음 
	Nested02 item = new Nested02();

	void method1() {
		Nested02 local = new Nested02();
	}
}
