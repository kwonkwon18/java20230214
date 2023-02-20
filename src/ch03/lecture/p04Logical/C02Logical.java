package ch03.lecture.p04Logical;

public class C02Logical {

	public static void main(String[] args) {
		// ^ (xor : exclusive or (배타적 논리합))
		// 두 논리연산자가 다르면 true, 같으면 false

		System.out.println(true ^ true); // false
		System.out.println(false ^ true); // true
		System.out.println(true ^ false); // true
		System.out.println(false ^ false); // false

		
		// & (and)
		// 피 연산자가 모두 ture 이면 true 나머지는 false
		System.out.println(true & true); // true
		System.out.println(false & true); // false
		System.out.println(true & false); // false
		System.out.println(false & false); // false
		
		// | (or)
		// 피연산자가 모두 false 이면 false 나머지는 true
		System.out.println(true | true); // false
		System.out.println(false | true); // false
		System.out.println(true | false); // false
		System.out.println(false | false); // true
	}

}
