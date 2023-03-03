package ch04.lecture.p04for;

public class C04For {

	public static void main(String[] args) {
		// for문 안에 for문(중첩)

		for (int i = 2; i < 10; i++) {
			System.out.println("*****" + i + "단*****");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}

	}

}
