package ch08.lecture.p03polymorphism;

public class C05Polymorphism {

	public static void main(String[] args) {

		String s1 = "hello world";
		StringBuilder s2 = new StringBuilder("world");

		// charsequence 타입이 들어갈 자리에 그 것을 구현한 객체가 들어갈 수 있다.
		String s3 = s1.replace(s2, "java");

		System.out.println(s3);

	}

}
