package ch05.lecture.p08regex;

public class C22Regex {

	public static void main(String[] args) {
		// 모든 문자
		// all character (may or may not match line terminators)
		// . 
		
		String pattern1 = "."; // 어떤 문자든지 한개로 이뤄져 있다. 
		
		System.out.println("a".matches(pattern1)); //true
		System.out.println("Z".matches(pattern1)); //true 
		System.out.println(" ".matches(pattern1)); //true
		System.out.println("\n".matches(pattern1)); //false
		
		String pattern2 = ".{3}"; // 어떤 문자든지 세개로 이뤄져 있다. 
		System.out.println("가나다".matches(pattern2)); // true 
		System.out.println("   ".matches(pattern2)); // true
		System.out.println("가1a".matches(pattern2)); // true
		

	}

}
