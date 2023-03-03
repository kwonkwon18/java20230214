package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		
		// 객체 생성
		A a = new A();
		
		// 필드값 변경
		a.field1 = 1; // o 퍼블릭
		a.field2  = 1; // o 디폴트
//		a.field3 = 1; // x 프라이빗 ==> A클래스에 접근 불가 

		// 메서드 호출
		a.method1(); // o 퍼블릭 
		a.method2(); // o 디폴트 
//		a.method3(); // x 프라이빗 ==> A클래스에 접근 불가 

	}
}