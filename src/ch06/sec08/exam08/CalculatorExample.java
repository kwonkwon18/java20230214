package ch06.sec08.exam08;

public class CalculatorExample {

	public static void main(String[] args) {
		// 객체 생성
		Calculator myCalcu = new Calculator();

		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);

		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10, 20);

		System.out.println("정사각형 : " + result1); // 정사각형 : 100.0
		System.out.println("직사각형 : " + result2); // 직사각형 : 200.0

	}

}
