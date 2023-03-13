package ch09.lecture.p02anonymous;

public class C09FinalVariable {
	// 로컬 클래스는 감싸고 있는 메서드의
	// 지역변수(파라미터)를 사용할 수 있다.
	// 이 때, 지역변수(파라미터)는 final 이어야 한다.

	public static void main(String[] args) {
		final int i = 10;
//		i = 11; // xxx

		class LocalClass {
			void method1() {
				System.out.println(i);
			}
		}
	}

	public void method1() {
		int i = 1;// effectively final

		class LocalClass {
			void method2() {
				System.out.println(i);
			}
		}
	}

	public void method2(final int param) {
		class LocalClass {
			void method3() {
				System.out.println(param);
			}
		}
	}

	// effectively final parameter
	public void method3(int param) {
		// param = 3; ==> 안됨, 그냥 매개변수를 받아서 쓸때는 사실상 파이널로 취급이 되지만
		// 변수를 바꿔주면 파이널이 아니게됨
		class LocalClass {
			void method4() {
				System.out.println(param);
			}
		}
	}
}
