package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		// 실수 연산
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양 :" + result); // 사과 1개에서 남은 양 :0.29999999999999993
		System.out.println();
		
		//정수 연산
		int apple1 = 1;
		int totalPieces = apple1 * 10;
		int number1 = 7;
		
		int result1 = totalPieces - number1;
		System.out.println("10조각에서 남은 조각: " + result1);
		System.out.println("사과 1개에서 남은 양: " + result1/10.0);
		

	}

}
