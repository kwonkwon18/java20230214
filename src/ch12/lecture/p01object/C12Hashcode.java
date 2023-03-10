package ch12.lecture.p01object;

public class C12Hashcode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();

		int h1 = o1.hashCode();
		int h2 = o2.hashCode();

		System.out.println(h1); // 1956710488
		System.out.println(h2); // 603856241
	}

}
