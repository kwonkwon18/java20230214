package ch02.sec01;

public class VariableExchangeExamplt {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;

		// 코드 작성
		int z = x; // z = 3; 
		x = y; // x = 5;
		y = z; // y = 3;

		System.out.println(x); // 5
		System.out.println(y); // 3
	}

}
