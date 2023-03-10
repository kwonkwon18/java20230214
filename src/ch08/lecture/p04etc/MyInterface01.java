package ch08.lecture.p04etc;

public interface MyInterface01 {
	void method1();

	// 인터페이스의 구현클래스에 모두 적용해주고 싶은(오버라이딩 하지 않는) 메서드를 만들어주는 법
	// 접근 제한자 public 생략되어있음.
	// default 를 꼭 명시해줘야 한다.
	default void method2() {
		System.out.println("Interface의 default method");
		System.out.println("body가 있는 메서드 , 공통적으로 가지게되는 메서드");
	}
}
