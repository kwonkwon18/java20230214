package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C09Arrays {

	public static void main(String[] args) {
		int arr1[] = {1,5,-22,42,5,1};
		
		// 정렬 오름차순
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1)); // [-22, 1, 1, 5, 5, 42]
		
		String[] arr2 = {"java", "hello", "html", "css"};
		
		System.out.println(Arrays.toString(arr2)); // [java, hello, html, css]
		
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2)); // [css, hello, html, java]

		String[] arr3 = {"java", "hello", "html", "JAVA", "css", "Css"};
		
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr3)); //[Css, JAVA, css, hello, html, java]
		// 대문자 코드값이 더 작기 때문에 대문자 먼저 나온다. 
		
		System.out.println(arr3[arr3.length-1]);
	}

}
