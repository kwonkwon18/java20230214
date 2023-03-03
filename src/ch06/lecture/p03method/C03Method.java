package ch06.lecture.p03method;

public class C03Method {

	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		MyClass03 o2 = new MyClass03();

		o1.greeting();
//		여러분 안녕하세요 ~
//		저는 null 입니다 ==> 필드 초기화를 안해줘서 기본값이 출력됨. 

		o1.name = "kwon"; // 필드값 초기화

		o1.greeting();
//		여러분 안녕하세요 ~
//		저는 kwon 입니다

		o2.greeting();
//		여러분 안녕하세요 ~
//		저는 null 입니다 ==> 다른 객체 참조하므로 영향 받지 않음

		o2.name = "seo";
		o2.greeting();
//		여러분 안녕하세요 ~
//		저는 seo 입니다

	}

}
