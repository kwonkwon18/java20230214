package ch09.sec04.exam03;

public class A {

	// method
	public void method1(int arg) { // final int arg
		// local variable
		// 값을 한번 받고 사용하는 경우, 사실상 final로 취급해줌
		int var = 1; // final int var = 1;

		// local class

		class B {
			// method
			void method2() {
				// read local class
				System.out.println("arg : " + arg);
				System.out.println("arg : " + var);

				// modifying local variable unable
				// arg = 2; (x)
				// var = 2;(x)
			}
		}

		// making local objcet
		B b = new B();
		// local object method evoke
		b.method2();

		// 로컬 변수 수정
		// arg = 3; xx
		// var = 3; xx
	}

}
