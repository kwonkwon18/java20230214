package ch04.lecture.p01if;

public class C01IF {

	public static void main(String[] args) {
		// if : 조건문, 분기문

		System.out.println("이전 실행문");

		if (false) {
			System.out.println("실행문 1");
		}

		System.out.println("실행문 2");

		// if 코드블럭의 명령문이 하나면 {} 생략 가능
		// 하지만 생략하지 말자 .

		if (true)
			System.out.println("실행문 3");

		System.out.println("명령문 4");
	}

}
