package ch06.lecture.p05this;

public class MyClass01 {

	// 인스턴스 필드

	String name;

	// 인스턴스 메서드
	void printName() {
		// this : 참조변수를 대체하는 키워드
		System.out.println(this.name);
		System.out.println(this.now());
	}
	
	String now() {
		return "한시 오분";
	}
}
