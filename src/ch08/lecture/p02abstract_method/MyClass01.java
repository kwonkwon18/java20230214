package ch08.lecture.p02abstract_method;

// 구현클래스(구체클래스, 구현클래스) 
public class MyClass01 implements MyInterface01 {

	// 구현할 메서드가 들어있음..! 근데 몸통은 없음..
	// 인터페이스를 구현하기위해서는 꼭 추상메서드를 구현해줘야함
	@Override
	public void method1() {

		System.out.println("구현 메서드");
	}

	public void method2() {
		System.out.println("추가된 메서드 ");
	}

}
