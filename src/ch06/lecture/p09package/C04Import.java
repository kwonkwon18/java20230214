package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.MyClass04;

public class C04Import {

	public static void main(String[] args) {

		// 경로는 다르지만 이름이 같은 이름의 패키지를 import 할 경우에는 한쪽은 경로와 이름을 다 적어줘야한다.

		MyClass04 o1 = new MyClass04();

		ch06.lecture.p09package.package2.MyClass04 o2 = new ch06.lecture.p09package.package2.MyClass04();

	}

}
