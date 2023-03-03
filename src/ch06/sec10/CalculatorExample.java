package ch06.sec10;

import java.util.Arrays;

public class CalculatorExample {

	public static void main(String[] args) {
		// static은 인스턴스 생성 없이도 가능하다 ex) Arrays, Math 매서드 등등
		double result1 = 10 * 10 * Calculator.pi; // 클래스 이름으로 직접 필드를 호출해준다. 

		int result2 = Calculator.plus(10, 5); // 클래스 이름으로 직접 메서드를 호출해준다. 
		int result3 = Calculator.minus(10, 5); // 클래스 이름으로 직접 메서드를 호출해준다. 

		System.out.println("result1 = " + result1); // result1 = 314.159
		System.out.println("result2 = " + result2); // result2 = 15
		System.out.println("result3 = " + result3); // result3 = 5
		
		// Arrays.toString
		int[] arr = {23,25,26};
		System.out.println(Arrays.toString(arr)); // [23, 25, 26]
		
	

	}

}
