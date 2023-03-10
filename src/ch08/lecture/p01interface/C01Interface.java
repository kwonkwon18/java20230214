package ch08.lecture.p01interface;

public class C01Interface {
	public static void main(String[] args) {

		MyClass01 o1 = new MyClass01();

		MyInterface01 o2 = o1; // 가능
		MyInterface02 o3 = o1; // 가능

		MyClass04 = o2; // xxx 반대로는 불가

	}

}
