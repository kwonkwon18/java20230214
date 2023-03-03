package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// 배열 변수 선언
		int[] scores;

		// 배열 변수에 배열을 대입
		scores = new int[] { 83, 90, 87 };

		// 배열 항목의 총합을 구하고 출력
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		// 배열을 매개값으로 주고, printItem() 메서드 호출
		printItem(new int[] { 83, 90, 87 });

	}

	// printItem() 메서드 선언
	public static void printItem(int[] aa) { // 매개변수명은 상관없다.
		// 매개변수가 참조하는 배열의 항목을 출력
		for (int i = 0; i < aa.length; i++) { // 매개변수의 길이가 조건으로 들어감
			System.out.println("score [ " + i + " ] : " + aa[i]);
		}
	}
}
