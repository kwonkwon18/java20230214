package ch04.lecture.p04for;

public class C02For {

	public static void main(String[] args) {
		// 변수 scope

		int i = 0; // 밖에서 선언됨
		while (i < 3) {
			System.out.println("while loop");
			i++;
		}

		int j = 0; // 이렇게 밖에 선언해주면 이용 가능.
		for (j = 0; j < 3; j++) {
			System.out.println("for loop");
		}
		System.out.println(i);
		System.out.println(j);

	}

}
