package ch04.sec04;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 2의 배수가 아닌 것들은 continue 로 하여 이후 처리 안함.
				continue;
			}
			System.out.println(i + " ");
		}

	}

}
