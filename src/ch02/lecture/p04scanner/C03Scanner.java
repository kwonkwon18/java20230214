package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번재 값 입력");
		String str1 = sc.nextLine();
		
		
		System.out.println("두번째 값 입력");
		String str2 = sc.nextLine();
		
//		System.out.println(str1 + str2); // 이렇게 하면 문자열 연결
		
		
		int num1 = Integer.parseInt(str1); // integer.parseint를 통해서 int 타입으로 바꿔줌
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);
	}

}
