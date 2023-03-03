package ch05.lecture.p08regex;

public class C26Regex {

	public static void main(String[] args) {
		// group
		// ()

		String pattern1 = "(\\w\\d){2}"; // 패턴이 복잡할 때, 괄호로 묶고 사용할 수 있다.

		System.out.println("a3_4".matches(pattern1)); // true

		// 전화번호
		// 010이 있어도되고 없어도 되고
		// 숫자 8개

		String pattern2 = "(010)?\\d{8}";

		System.out.println("01099999999".matches(pattern2)); // true
		System.out.println("88888888".matches(pattern2)); // true

	}

}
