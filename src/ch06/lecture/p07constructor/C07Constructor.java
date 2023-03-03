package ch06.lecture.p07constructor;

public class C07Constructor {

	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07("kwon",29); // 파라미터를 받는 생성자 호출
		
		// 기본생성자도 쓰고 싶어 !
		MyClass07 o2 = new MyClass07(); // 기본생성자 호출

	}

}
