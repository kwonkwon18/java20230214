package ch06.lecture.p04static;

public class MyClass04 {
	// static member
	// 스테틱 멤버끼리 서로 접근이 가능하다. 
	static String name;
	
	static void hello() {
		System.out.println(name + " 님 안녕하세요 ");
		System.out.println("오늘은 " + now() + " 입니다");
	}
	
	static String now() {
		return "2023-02-28";
	}
}
