package ch06.lecture.p03method;

public class MyClass12 {

	int method1() {

		// 1. 메서드 종료
		// 2. 오른쪽 값을 호출한 곳으로 return(반환)
		// 3. 오른쪽 값은 메소드 리턴타입과 일치해야함
		return 3;
	}

	// 메서드의 리턴 타입을 명시하면
	// 해당 타입의 값을 꼭 리턴해야함
	int method2() {
		if (true) {
			return 3; // if 문안에 있기 때문에 실행되지 않을 수도 있으므로 오류 발생
		}
		return 5; // 안정적으로 리턴 될수 있게 넣어줘야함.
	}

	// 자동 형변환
	int method3() {
		int a = 3;

		return a;
	}

//	int method4() {
//		long a = 3L;
//		
//		return a; long 타입을 리턴해서 안됨
//	}

	int method5() {
		short a = 6000;

		return a; // 자동 형변환이 가능하기 때문에 가능한 메서드
	}

	double method6() {
		double d = 3.14;

		return d;
	}

	double method7() {
		long l = 33L;

		return l; // 자동형변환
	}

	// 리턴이 없으면 void 로 리턴타입 명시
	void method8() {

		return; // 만약 return을 쓴다면 메서드를 종료하는 역할로만 사용 가능.
	}

}
