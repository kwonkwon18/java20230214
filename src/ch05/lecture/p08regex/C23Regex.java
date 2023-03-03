package ch05.lecture.p08regex;

public class C23Regex {

	public static void main(String[] args) {
		// .
		// \.
		
		String pattern1 = ".";
		String pattern2 = "\\.";
		
		System.out.println("a".matches(pattern1)); // true
		System.out.println("a".matches(pattern2)); // false
		
		System.out.println(".".matches(pattern1)); // true
		System.out.println(".".matches(pattern2)); // true

		
		// 영문대소문자 여러개 .com으로 끝나는지?
		
		String pattern3 = "[a-zA-Z]+\\.com"; // +는 여러개를 뜻함
		System.out.println("naver.com".matches(pattern3)); //true
		System.out.println("navercom".matches(pattern3)); //false
		System.out.println("naver.net".matches(pattern3)); //false

		
		
	}

}
