package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String input = "3 33 555 50"; // 띄어쓰기로 토큰이 구분되어있음
		Scanner sc = new Scanner(input);
		
		int num1 = sc.nextInt();
		System.out.println(num1);
		int num2 = sc.nextInt(); // 다음 토큰을 읽어냄
		System.out.println(num2);
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println(num2+ num3); // int 인지 확인 
}
}
