package ch06.lecture.p07constructor;

public class C02Constructor {

	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		MyClass02 o2 = new MyClass02();

		o1.desc(); // null모델 가격0원 ==> 필드 초기화를 하지 않음

	}

}
