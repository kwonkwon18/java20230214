package ch08.lecture.p04etc;

public interface MyInterface02 {

	// private (default로 하면 구현에서도 쓰이기 때문에 혼란스러울 수 있음)
	// private 로 해줘서 인터페이스 안에서의 코드를 간결하게 하는 용도로만 사용할 수 있다.
	private void common() {
		System.out.println("공통된 코드들");
	}

	default void method1() {
		common();
		System.out.println("메서드 1 코드들...");
	}

	default void method2() {
		common();
		System.out.println("메서드 2 코드들...");
	}

}
