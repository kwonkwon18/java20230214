package ch09.lecture.p02anonymous;

public class C02Anonymous {

	public static void main(String[] args) {

		// 상속과 인스턴스 생성을 동시에
		SubClass01 o1 = new SubClass01() {	
			// 클래스 구현
			
		};

	}

}

class MyClass01 {

}

class SubClass01 extends MyClass01 {
	// 클래스 구현

}