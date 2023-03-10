package ch08.lecture.p05cast;

import java.lang.constant.Constable;

public class C04Instanceof {
	public static void main(String[] args) {
		String s1 = "java";

		// string의 조상들임 혹은 본인
		System.out.println(s1 instanceof String); // true
		System.out.println(s1 instanceof Object); // true
		System.out.println(s1 instanceof CharSequence); // true
		System.out.println(s1 instanceof Comparable);// true
		System.out.println(s1 instanceof Constable); // true
	}

}
