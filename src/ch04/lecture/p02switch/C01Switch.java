package ch04.lecture.p02switch;

public class C01Switch {

	public static void main(String[] args) {
		// switch
		// 값에 따라 실행 흐름을 변경할 때 사용

		System.out.println("이전 실행문 /// ");

		switch (6) {
		case 1:
			System.out.println("케이스 1 실행");
			break;
		case 2:
			System.out.println("케이스 2 실행");
			break;
		case 3:
			System.out.println("케이스 3 실행");
			break;
		default: // 매칭되는 값이 없을 때 실행시켜줄 값. 
			System.out.println("케이스 4 실행 (모두 포함되지 않았음) ");
		}

		System.out.println("다음 흐름...");

		int value = 3;

		if (value == 1) {
			System.out.println("코드 1");
		} else if (value == 2) {
			System.out.println("코드 2");
		} else {
			System.out.println("코드 3");
		}

	}

}
