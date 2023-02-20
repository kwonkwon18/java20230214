package ch03.lecture.p01arithmetic;

public class C09Increment {

	public static void main(String[] args) {
		// 증가연산자 (++)
		// 감소연산자 (--)

		int x = 1;
		int y = 1;

		x++; // x는 2가 됨
		++x; // x는 3이 됨

		y--; // y는 0이 됨
		--y; // y는 -1이 됨

		System.out.printf("%d, %d%n", x, y); // x = 3, y = -1

		int z = x++ + 10; // z = 13 // 기존x 값을 계산해준 뒤 x+1을 해줌
		int w = ++y + 10; // w = 10

		System.out.println(x); // 4가 됨


	}

}
