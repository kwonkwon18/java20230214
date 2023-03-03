package ch05.lecture.p04string;

import java.util.Arrays;

public class C03Split {

	public static void main(String[] args) {
		// split
		// 특정 문자 패턴으로 문자열을 나누어서 배열로 리턴

		String str1 = "hello,java,world,html,css";
		String[] arr1 = str1.split(","); // 리턴타입이 String 배열 타입이다.
		System.out.println(arr1[0]); // hello
		System.out.println(arr1[4]); // css

		String str2 = "spring react vue angular jsp sass";
		String[] arr2 = str2.split(" ");
		System.out.println(arr2[0]); // spring

		String str3 = "I'm ironman.";
		String[] arr3 = str3.split("");

		System.out.println(Arrays.toString(arr3)); // 12
		
		for (int i = 0; i < str3.length(); i++) {
			if(arr3[i] == "I") {
				arr3[i] = " ";
			}
		}
System.out.println(arr3[0]);

	}

}
