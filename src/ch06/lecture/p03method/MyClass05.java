package ch06.lecture.p03method;

public class MyClass05 {

	void method1() {
		// 실행코드
		System.out.println("파라미터 없는 메서드");
	}

	void method2(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	void method3(int line) {
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	void method4(int param) { //파라미터도 변수의 일종 , 메서드 호출할 때 값을 가진다. 
		int var;
		var = 3;  // 지역변수
		
		System.out.println(param * var);
	}

}
