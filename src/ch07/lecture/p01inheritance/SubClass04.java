package ch07.lecture.p01inheritance;

public class SubClass04 extends SuperClass04 {

	SubClass04() {
		System.out.println("자슥클래스 호출");
	}

	@Override // 재정의 메서드인지 컴파일러가 검증
	public void method1() {
		System.out.println("sub method1");
	}

	@Override // 어노테이션 (annotation)
	public void method2() {
		System.out.println("sub method2");
	}
}
