package ch16.lecture.p02lambda;

public class C05Lambda {
	public static void main(String[] args) {
		MyInterface05 o1 = new MyClass05();
		int r1 = o1.method(); // 명령문 작성

		// 기본 람다
		MyInterface05 o2 = () -> {
			return 3;
		};
		int r2 = o2.method();

		// 기본 람다식을 줄인 식
		MyInterface05 o4 = () -> 5;
		int r4 = o4.method();

		System.out.println(r1 + r2 + +r4);
	}

}

class MyClass05 implements MyInterface05 {
	@Override
	public int method() {
		System.out.println("명령문 작성");
		return 0;
	}
}

// 리턴타입이 있음
interface MyInterface05 {
	int method();
}
