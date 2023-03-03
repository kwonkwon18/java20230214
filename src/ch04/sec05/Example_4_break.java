package ch04.sec05;

public class Example_4_break {

	public static void main(String[] args) {

		while (true) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;

			if (a + b == 5) {
				System.out.println(a + " , " + b);
				break;
			}
			System.out.println(a + " , " + b);
		}

	}

}
