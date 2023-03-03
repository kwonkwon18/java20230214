package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {

	public C() {

		// 객체 생성
		A a = new A();

		// 필드값 변경
		a.field1 = 1; // 퍼블릭 o ==> 어디서든 접근 가능
//		a.field2 = 1; x 디폴트 ==> 같은 패키지 안에서만 접근 가능 
//		a.field3 = 1; x 프라이빗 ==> 같은 패키지 x, 같은 클래스 x

		// 메서드 호출
		a.method1(); // 퍼블릭 o ==> 어디서든 접근 가능
//		a.method2(); x 디폴트 ==> 같은 패키지 안에서만 접근 가능 
//		a.method3(); x 프라이빗 ==> 같은 패키지 x, 같은 클래스 x

	}

}
