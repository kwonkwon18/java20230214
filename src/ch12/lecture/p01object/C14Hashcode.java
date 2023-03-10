package ch12.lecture.p01object;

public class C14Hashcode {

	public static void main(String[] args) {

		// 해쉬코드를 재정의하여 같은 해쉬코드 (99) 가 나오게 함

		Object o1 = new MyClass14();
		Object o2 = new MyClass14();

		int h1 = o1.hashCode();
		int h2 = o2.hashCode();

		System.out.println(h1); // 99
		System.out.println(h2); // 99

	}

}

class MyClass14 {

	@Override
	public int hashCode() {

		return 99;
	}

}
