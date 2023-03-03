package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20Regex {

	public static void main(String[] args) {

		String str1 = " af dfjk dfjkl dfjkldf dfjdfl ";
		String str2 = str1.replaceAll("\\s+", "");
		
		System.out.println(str1); // af dfjk dfjkl dfjkldf dfjdfl 
		System.out.println(str2); // afdfjkdfjkldfjkldfdfjdfl
		
		String str3 = "dfadsf ,    dsfjkdf ,   df   ,  dfdf";
		String str4[] = str3.split("\s*,\s*");
		
		System.out.println(Arrays.toString(str4)); //[dfadsf, dsfjkdf, df, dfdf]==> 컴마 앞뒤 공백을 구분자로해서
		
		
	}

}
