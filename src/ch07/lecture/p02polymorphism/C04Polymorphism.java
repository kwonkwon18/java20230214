package ch07.lecture.p02polymorphism;

import java.util.Scanner;

public class C04Polymorphism {

	public static void main(String[] args) {
		String s1 = "java";
		Scanner sc1 = new Scanner("");

		method1(s1); // 가능함
		method1(sc1); // 가능함

	}

	public static void method1(Object o) {

//		o.charAt() ;  이런거 안됨

		String s = o.toString(); // toString 은 Object 가 가지고 있는 메서드이므로 가능함.

		System.out.println(s);

	}
}
