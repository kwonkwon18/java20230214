package ch03.lecture.p01arithmetic;

public class C01Arithmetic {

	public static void main(String[] args) {
		//산술연산자
		// +. -. *. / , %
		
		int i1 = 30;
		int i2 = 50;
		
		System.out.println(i1 + i2); // 더하기
		System.out.println(i1 - i2); // 빼기
		System.out.println(i1 * i2); // 곱하기
		System.out.println(i1 / i2); // 나누기 - 정수간의 연산은 결과가 정수
		System.out.println(i1 % i2); // 나머지 (modulos)

		
		double d1 = 3.14;
		double d2 = 9.9;
		
		System.out.println(d1 + d2);
		System.out.println(d1 - d2);
		System.out.println(d1 * d2);
		System.out.println(d1 / d2);
		
		// 정수와 실수의 산술연산
		// 결과는 실수 !
		int i3 = 10;
		double d3 = 3;
		
		System.out.println(i3 + d3);
		System.out.println(i3 - d3);
		System.out.println(i3 * d3);
		System.out.println(i3 / d3);
		
		// *, /, % 가 +,- 보다 우선순위 높음 But 괄호를 잘 사용할 것
		int i4 = 5 + 3 / 2 ; // 6 , int 형이므로 소수점 아래 버림
		int i5 = 5 * 3 + 10; // 25
		int i6 = 9 + 10 % 3; // 10
		
		System.out.printf("%d %d %d", i4, i5, i6);
		
		//괄호를 잘 써주자 
		int i7 = 5 + (3 / 2) ; // 6 , int 형이므로 소수점 아래 버림
		int i8 = (5 * 3) + 10; // 25
		int i9 = 9 + (10 % 3); // 10
	}

}
