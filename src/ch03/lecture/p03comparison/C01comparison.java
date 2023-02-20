package ch03.lecture.p03comparison;

public class C01comparison {

	public static void main(String[] args) {
		// 비교연산자
		// == , != , > , <= , >, >=

		int x = 3;
		int y = 5;

		boolean r1 = x == y; // false
		boolean r2 = x != y; // true

		boolean r3 = x < y; // true
		boolean r4 = x <= y; // true

		boolean r5 = x > y; // false
		boolean r6 = x >= y; // false

		// 같은 타입끼리 비교해야함

		int a = 30;
		String b = "40";
		boolean c = true;

//		boolean r7 = a < b; 서로 타입이 다르기 때문에 비교할 수 없음

//		boolean r8 = a < c; 서로 타입이 다르기 때문에 비교할 수 없음

		// 정수, 실수는 가능
		// 하지만 타입을 맞춘 후 비교해야 오류를 줄일 수 있다. 

		int num1 = 30;
		double num2 = 30.0;
		boolean r9 = num1 == num2; // true
		System.out.println(r9);

	}

}
