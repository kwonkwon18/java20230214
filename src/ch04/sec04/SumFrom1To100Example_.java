package ch04.sec04;

public class SumFrom1To100Example_ {

	public static void main(String[] args) {
		int sum = 0;
		int i; // 카운터 변수

		for (i = 0; i < 100; i++) {
			sum += i;
		}

		System.out.println("1 ~" + (i) + "합 : " + sum);

	}

}
