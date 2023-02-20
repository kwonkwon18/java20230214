package ch03.lecture.p06string;

import java.nio.file.spi.FileSystemProvider;

public class C03CharAt {
	public static void main(String[] args) {
		//charAt
		//특정 위치 (index) 에 있는 문자 확인
		// return type : char
		
		String str1 = "spring";
		
		System.out.println("길이 : " + str1.length());
		
		char c1 = str1.charAt(0);
		System.out.println("3의 위치 : " + str1.charAt(3));
		
		char c2 = str1.charAt(1);
		System.out.println(c2);
		
		System.out.println(str1.charAt(5));
		
		System.out.println(str1.charAt(str1.length() -1 )); // 마지막 인덱스 값을 꺼낼 때 
	}
}
