package ch06.lecture.p04static;

public class MyClass03 {

	// instance member 끼리 접근 가능
	// field 에서 사용한 name 를 method 에서 사용
	// instance method가 다른 instance method 를 사용할 수 있음

	String name;

	void hello() {
		System.out.println(name + " 님 안녕하세요 ");
		System.out.println("오늘은" + now() + "입니다");
	}
	
	String now() {
		return "2023년 02월 28일";
	}

}
