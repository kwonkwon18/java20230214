package ch04.sec04;

public class example_3 {

	public static void main(String[] args) {
		// while 문을 사용해서 1~100 까지 3의 배수의 총합을 출력

		int i = 1;
		int sum = 0;

		while (i <= 100) {
			if (i % 3 == 0) {
				sum += i;
				i++;
			} else {
				i++;
			}
		}
		System.out.println(sum);

	}

}
