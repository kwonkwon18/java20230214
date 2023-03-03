package ch07.lecture.p01inheritance;

public class C03Override {

	public static void main(String[] args) {
		SubClass03 o1 = new SubClass03();
//		부모클래스 호출
//		서브 클래스 생성자 호출 ==> 부모클래스를 먼저 호출하고 그 다음에 상속받은 클래스를 호출하게 된다. 

		o1.method1(); // 슈퍼클래스 메서드 1
		o1.method2(); // 재정의한 메서드 2
		o1.method3(); // 서브클래스 메서드 3

	}

}
