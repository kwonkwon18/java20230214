package ch13.lecture.p01generic;

public class C03Diamond {

	// 인스턴스 만드는 타입의 아규먼트 생략 가능
	MyClass03<String> o1 = new MyClass03<>();

}

class MyClass03<T> {
	public T item;
}
