package ch09.lecture.p02anonymous;

public class C08Anonymous {
	
	// 인터페이스도 익명 객체로 구현할 수 있다. 
	
	public static void main(String[] args) {
		MyInterface08 o1 = new MyInterface08() {
			@Override
			public void method1() {
				System.out.println("메서드 재정의 ");

			}
		};
	}

}

interface MyInterface08 {
	void method1();
}
