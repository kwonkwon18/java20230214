package ch05.lecture.p04string;

public class C01String {

	public static void main(String[] args) {
		
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		String str3 = str2;
		
		System.out.println(str1 == str2); //false ==> 다른 주소값
		System.out.println(str1.equals(str2)); //true ==> 내용만 봄
		
		System.out.println(str2 == str3); // true ==> 같은 주소 값

	}

}
