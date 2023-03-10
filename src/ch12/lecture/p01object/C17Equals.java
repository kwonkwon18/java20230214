package ch12.lecture.p01object;

public class C17Equals {

	public static void main(String[] args) {
		Object o1 = new MyClass17();
		Object o2 = new MyClass17();
		Object o3 = new MyClass17();

		// 해쉬 들어가고
		System.out.println(o1.hashCode()); // 99
		System.out.println(o2.hashCode()); // 99
		System.out.println(o3.hashCode()); // 99

		// 이퀄 들어가고

		System.out.println(o1.equals(o2)); // true
		System.out.println(o1.equals(o3)); // true
		System.out.println(o2.equals(o3)); // true
	}

}

class MyClass17 {

	@Override
	public int hashCode() {

		return 99;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}

}
