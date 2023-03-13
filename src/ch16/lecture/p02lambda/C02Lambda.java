package ch16.lecture.p02lambda;

public class C02Lambda {

	public static void main(String[] args) {
		// 파라미터가 없으면 빈 ()
		// 메서드 body 는 {}
		MyInterface02 o1 = () -> {
			// 메서드 body
			System.out.println("메서드 body 작성1 .  ");
			System.out.println("메서드 body 작성2 .  ");
			System.out.println("메서드 body 작성3 .  ");
		};
		o1.method1();

		// 메서드의 명령문이 하나이면 중괄호 생략 가능, 생략 가능하면 생략 !!
		// lambda는 생략할 수록 읽기 쉬움
		MyInterface02 o2 = () -> System.out.println("중괄호 생략한 람다식");
		o2.method1();

	}

	@FunctionalInterface
	interface MyInterface02 {
		// 파라미터가 없는 메서드
		void method1();
	}

}
