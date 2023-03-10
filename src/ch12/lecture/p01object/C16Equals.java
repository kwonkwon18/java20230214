package ch12.lecture.p01object;

public class C16Equals {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1; // o1과 o3의 해쉬값은 같다.

		System.out.println(o1.hashCode()); // 1956710488
		System.out.println(o2.hashCode()); // 603856241
		System.out.println(o3.hashCode()); // 1956710488

		System.out.println(o1.equals(o3)); // true
		System.out.println(o1.equals(o2)); // false

		System.out.println(o3.equals(o1)); // true
		System.out.println(o3.equals(o2)); // false

	}

}
