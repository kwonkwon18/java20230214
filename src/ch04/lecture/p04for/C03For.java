package ch04.lecture.p04for;

public class C03For {

	public static void main(String[] args) {
		// for 안에 여러 변수를 선언할 수 있다. 
		for (int i = 0, j = 10; i < 5 ; i++, j--) {
			System.out.printf("%d, %d%n", i, j);
		}

	}

}
