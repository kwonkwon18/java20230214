package ch13.lecture.p02WildCard;

public class C03WilldCard {

	public static void main(String[] args) {
		MyClass03<? super Number> o1 = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();

		o1.item = new Number(); // 됨 (추상클래스여서 인스턴스화 하지 못함)
		o1.item = new Integer(); // ok

		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();

		Number n1 = o4.item; // ok
		Object o5 = o4.item;
		Integer i = o4.item; // 이건 안됨, 타입이 인티저라고 장담 할 수 가 없음, 인티저보다 하위클래스일수도 있기 때문에

	}

}

class MyClass03<T> {
	public T item;

}