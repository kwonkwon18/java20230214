package ch08.sec07;

public interface Service {
	// ** static 메서드는 인스턴스 메서드 안에서 쓸 수 있지만,
	// ** 인스턴스 메서드는 static 메서드 안에서 사용할 수 없다.
	// 디폴트 메서드
	default void defaultMethod1() {
		System.out.println("defulatMethod1 code ...");
		defaultCommon();
	}

	default void defaultMethod2() {
		System.out.println("defulatMethod2 code ...");
		defaultCommon();
	}

	// private 메서드
	private void defaultCommon() {
		System.out.println("defulatMethod code A...");
		System.out.println("defulatMethod code B...");
	}

	// static 메서드
	static void staticMethod1() {
		System.out.println("staticMethod1 code");
		staticCommon();
	}

	static void staticMethod2() {
		System.out.println("staticMethod2 code");
		staticCommon();
	}

	// private static 메서드
	private static void staticCommon() {
		System.out.println("staticMethod code C...");
		System.out.println("staticMethod code D...");

	}
}
