package ch08.sec10.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// 구현객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		// 인터페이스 변수 선언
		A a;

		// 변수에 구현 객체 대입
		a = b; // 가능 , 자동 타입 변환
		a = c; // 가능 , 자동 타입 변환
		a = d; // 가능 , 자동 타입 변환
		a = e; // 가능 , 자동 타입 변환

	}

}
