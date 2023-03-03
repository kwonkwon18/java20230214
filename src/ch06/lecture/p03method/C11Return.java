package ch06.lecture.p03method;

public class C11Return {

	public static void main(String[] args) {
		MyClass11 o1 = new MyClass11();
		
		
		System.out.println("메인 코드 1");
		o1.method2(); // 1 , 2는 return 문 아래에 있으므로 실행되지 않음

		System.out.println("메인 코드 2");
		
	}

}
