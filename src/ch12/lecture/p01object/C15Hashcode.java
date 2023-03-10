package ch12.lecture.p01object;

public class C15Hashcode {

	public static void main(String[] args) {

		/*
		 * String 타입 객체들의 해쉬코드를 호출하였을 때, 같은 문자열을 가지고 있는 String 해쉬코드의 경우는 같은 값을 리턴하였다
		 * (String의 해쉬코드는 재정의가 되어 있다)
		 */

		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");

		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		int h3 = o3.hashCode();

		System.out.println(h1); // 3254818
		System.out.println(h2); // -895679987
		System.out.println(h3); // 3254818

	}

}
