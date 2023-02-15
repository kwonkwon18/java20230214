package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키보드로 작성해보세요 >");
		
//		sc.nextLine(); // 스캐너가 엔터를 만나기 전까지 감
		// 한줄의 내용을 리턴하고 끝냄
		
		String line = sc.nextLine();
		
		System.out.println("입력된 값 출력");
		System.out.println(line);
		
	}

}
