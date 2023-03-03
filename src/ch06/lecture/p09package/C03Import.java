package ch06.lecture.p09package;

import java.util.Scanner;

//import 생략 가능
// 1. java.lang 패키지 내 클래스 생략 가능
// 2. 같은 패키지의 클래스 생략 가능

// ctrl + shift + o 를 활용해서 import 를 넣자. 
import java.lang.String; // 생략 가능

public class C03Import {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str1 = new String("hello");
		String str2 = "world";

		MyClass03 o1 = new MyClass03(); // 같은 패키지 내에 있으므로 import 생략가능

	}

}
