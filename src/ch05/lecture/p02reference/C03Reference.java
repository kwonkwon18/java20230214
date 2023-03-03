package ch05.lecture.p02reference;

public class C03Reference {

	public static void main(String[] args) {
		int a = 3;

		method1(a); // 3

		System.out.println(a); // 3, 변경되지 않음
	}

	public static void method1(int b) { // a가 가진 값이 복사됨
		System.out.println(b); // 파라미터 값 출력
		b = 30;
		System.out.println(b); // 30
	}

}
