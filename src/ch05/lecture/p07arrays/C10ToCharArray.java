package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C10ToCharArray {

	public static void main(String[] args) {
		// String의 toCharArray
		
		String str1 = "hello world";
		
		String arr1[] = str1.split("");
		
		System.out.println(Arrays.toString(arr1)); //[h, e, l, l, o,  , w, o, r, l, d] ==> 각 원소가 String 타입
		
		
		char[] arr2 = str1.toCharArray();
		System.out.println(Arrays.toString(arr2)); //[h, e, l, l, o,  , w, o, r, l, d] ==> 각 원소가 char 타입
		
		
		

	}

}
