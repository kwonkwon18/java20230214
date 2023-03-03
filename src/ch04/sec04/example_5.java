package ch04.sec04;

public class example_5 {

	public static void main(String[] args) {
		// 4x + 5y = 60;
		// (x,y)

		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {

				int result = (4 * x) + (5 * y); // result 에 연산되는 방식을 넣어준다. 

				if (result == 60) { // result는 들어갈 수 있다. 
					System.out.printf("%d, %d%n", x, y);
				}
			}

		}
	}
}