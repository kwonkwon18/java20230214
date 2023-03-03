package ch06.lecture.p04static;

public class C02Static {

	public static void main(String[] args) {

		// 클래스가 가지고 있는 것들이기 때문에 인스턴스 선언 없이도 사용할 수 있다.

		MyClass02.age = 29;
		MyClass02.name = "seo";

		MyClass02.greeting();

	}

}
