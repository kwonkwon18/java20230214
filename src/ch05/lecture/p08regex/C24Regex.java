package ch05.lecture.p08regex;

public class C24Regex {

	public static void main(String[] args) {
		// 한글만

		// 영문소문가 [a-z]
		// 영문대문자 [A-Z]
		// 한글 [가-힣]

		String pattern1 = "[가-힣]";

		System.out.println("산".matches(pattern1)); // true
		System.out.println("a".matches(pattern1)); // false
		System.out.println("3".matches(pattern1)); // false

		// 한글 두글자 이상 공백 없이
		String pattern2 = "[가-힣]{2,}";
		System.out.println("백두".matches(pattern2)); // true
		System.out.println("산".matches(pattern2)); // false
		System.out.println("백두산".matches(pattern2)); // true

	}

}
