package ch04.lecture.p02switch;

public class C04Switch {

	public static void main(String[] args) {
		// switch labeled statement
		// break 없이 코드 블럭 작성 가능

		int val = 3;

		switch (val) {
		case 1:
			System.out.println("코드1");
			break;
		case 2, 3:		
			System.out.println("코드2");
			break;
		default:
			System.out.println("default 코드");

		}

		// -> (애로우) 를 사용하면 break 없이도 case 문 생성 가능
		switch (val) {
		case 1 -> {
			System.out.println("코드 1");
		}
		case 2, 4 -> {
			System.out.println("코드 2");
		}
		default -> {
			System.out.println("디폴트 코드 ");
		}
		}

	}

}
