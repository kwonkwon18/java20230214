package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue()); // value : 100

		// Unboxing
		int value = obj;
		System.out.println("value : " + value); // value : 100

		// 연산 시 unboxing
		int result = obj + 100;
		System.out.println("value : " + result); // value : 200

	}

}
