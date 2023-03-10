package ch08.lecture.p05cast;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05Instanceof {

	public static void main(String[] args) {
//		method("java");
//		method(new StringBuilder("java")); // <<== api 봐야한다. 
		method(new StringBuffer(""));
	}

	public static void method(CharSequence c) {
		System.out.println(c instanceof String); // f
		System.out.println(c instanceof Object); // t
		System.out.println(c instanceof CharSequence); // t
		System.out.println(c instanceof Comparable);// t
		System.out.println(c instanceof Constable); // f
		System.out.println(c instanceof Serializable); // t
		System.out.println(c instanceof ConstantDesc); // f

	}

}
