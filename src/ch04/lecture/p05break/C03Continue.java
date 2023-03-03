package ch04.lecture.p05break;

public class C03Continue {

	public static void main(String[] args) {

		while (true) {

			System.out.println("실행문 1");

			if (true) { // true 일 경우 실행문 1만 무한 루프하게 된다. 
				continue;
			}
			System.out.println("실행문 2");
		}

	}

}
