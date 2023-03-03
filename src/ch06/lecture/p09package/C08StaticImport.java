package ch06.lecture.p09package;

import static java.lang.Math.*;

public class C08StaticImport {

	public static void main(String[] args) {

		double num1 = floor(random() * 6) + 1; // static 으로 했기 때문에 별도의 클래스. 없이도 할 수 있다.
		double num2 = floor(random() * 6) + 1;

		System.out.println((int) num1);
		System.out.println((int) num2);

	}

}
