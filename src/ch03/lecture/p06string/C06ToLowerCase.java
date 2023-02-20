package ch03.lecture.p06string;

public class C06ToLowerCase {

	public static void main(String[] args) {
		//tolowerCase
		//소문자로 바꾼 문자열 리턴
		//return type : String
		
		
		
		//toUpperCase
		//대문자로 바꾼 문자열 리턴
		//return type : String
		
		
		String str1 = "i'am IronMan";
		String res1 = str1.toLowerCase();
		System.out.println(str1); // i'am IronMan
		System.out.println(res1); // i'am ironman
		
		String res2 = str1.toUpperCase();
		System.out.println(res2); // I'AM IRONMAN
		
		//대소문자 구분 없이 문자열 위치 확인 
		String res3 = str1.toLowerCase();
		System.out.println(res3.indexOf("ir")); // 5
		System.out.println(str1.toLowerCase().indexOf("ir")); // 5
		
		// 대소문자 구분없이 특정 문자열이 있는지 확인
		String str4 = "lerem ipSum";
		String res4 = str4.toLowerCase();
		
		System.out.println(str4.contains("sum")); // false , 대소문자 구분하기 때문에 없다고 나옴
		System.out.println(res4.contains("sum")); // true , boolean  값으로 리턴됨 .
		
	}

}
