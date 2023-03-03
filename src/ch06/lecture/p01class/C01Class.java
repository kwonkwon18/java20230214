package ch06.lecture.p01class;

public class C01Class {

	public static void main(String[] args) {
		MyClass01 var1 = new MyClass01(); // 인스턴스 생성, 직접만든 설계도를 var1에 넣었다.타입은 클래스와 같다.
		MyClass01 var2 = new MyClass01(); // 서로 다른 인스턴스를 생성

		System.out.println(var1); // ch06.lecture.p01class.MyClass01@23fe1d71 주소 다름
		System.out.println(var2); // ch06.lecture.p01class.MyClass01@28ac3dc3

	}

}

// 클래스 작성
// 클래스명 : UpperCamelCase로 작성
// 하나의 클래스는 하나의 파일로 작성
class MyClass01 {
	// 어떤 값을 가져야 하는지? (필드)

	// 어떤 기능이 있어야 하는지? (메서드)

}