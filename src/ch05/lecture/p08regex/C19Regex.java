package ch05.lecture.p08regex;

public class C19Regex {

	public static void main(String[] args) {
		// 특수기호
		// predefined character classes (미리 정의된 집합)
		// 숫자 ==> \\d

		String parrten1 = "[0-9]";
		String parrten2 = "\\d"; // \d 에 해당하는게 있기 때문에 \를 한번 더 써줘야함;

		System.out.println("0".matches(parrten1)); // true
		System.out.println("0".matches(parrten2)); // true
		
		System.out.println("19950118".matches("[0-9]{8}")); //true
		System.out.println("19950118".matches("\\d{8}")); //true
		System.out.println("19950118".matches("[0-9]*")); //true
		
		// 전화번호
		// 010으로 시작, - 하나 있거나 없거나, 숫자 4개, - 하나 있거나 없거나, 숫자 4개
		// 아래 3패턴이 모두 잘 작성된 패턴으로 되려면?
		String pattern3 = "01099999999";
		String pattern4 = "010-88888888";
		String pattern5 = "010-7777-7777";
		
		String pattern6 = "010-?\\d{4}-?\\d{4}"; // ? 는 있거나 없거나
		
		System.out.println(pattern3.matches(pattern6)); // true
		System.out.println(pattern4.matches(pattern6)); // true
		System.out.println(pattern5.matches(pattern6)); // true

		// 빈칸
		// \s
		
		String pattern1 = "\\s"; // \s
		
		System.out.println(" ".matches(pattern1)); // true
		System.out.println("\n".matches(pattern1)); // true
		System.out.println("\t".matches(pattern1)); // true
		
		// 소문자 단어 3개로 이뤄져 있는지 
		String parttern2 = "\s*+[a-z]+\s[a-z]+\s[a-z]+\s*";
		
		System.out.println("hello world java".matches(parttern2)); // true
		System.out.println("    hello world java    ".matches(parttern2)); // true
		System.out.println("hello java".matches(parttern2)); // false

	}

}
