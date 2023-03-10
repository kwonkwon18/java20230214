package ch07.lecture.p05polymorphism;

import java.math.BigDecimal;

public class C02Polymorphism {
	public static void main(String[] args) {

		//Number의 구현 클래스들이다. 
		Integer i1 = new Integer("66");
		printInteger(i1);

		Double d2 = new Double(3.12);
		printInteger(d2);

		BigDecimal b2 = new BigDecimal("3.14");
		printInteger(b2);

	}

	public static void printInteger(Number n) {
		int intNum = n.intValue();
		System.out.println(intNum);
	}
}
