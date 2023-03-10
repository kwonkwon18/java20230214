package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C03Polymorphism {

	public static void main(String[] args) {

		String s1 = "헬로";
		Object o1 = s1;

		Object o2 = "java";

		char c1 = s1.charAt(1);
//		char c2 = o1.charAt(); 얘는 안됨..

		Scanner sc1 = new Scanner("");

		Object o3 = sc1;

		Object o4 = new Scanner("");

		sc1.nextLine();
//		o4.nextLine();  ==> 이건 안됨
		// object 클래스 안에 nextline 메서드가 없음

	}

}
