package ch06.lecture.p06final;

public class C01Final {

	public static void main(String[] args) {
		// final : 값을 한번만 할당 할 수 있다.
		int a = 3;
		a = 5;

		final int b = 5;
//		b = 4; xxx , final로 앞에 할당해줘서 값을 바꾸지 못함

	}

	static void method(int i) {
		System.out.println(i);
		i = 5;
		System.out.println(i);
	}

	static void method2(final int i) {
		System.out.println(i);
//		i = 9;  final 로 해줬기 때문에 변경하지 못함
		System.out.println(i);
	}

}
