package ch04.lecture.p02switch;

public class C06Switch {
	public static void main(String[] args) {
		// switch case(:) statement
		// switch labeled (->) statement

		// switch case ( : 쓴 것) expression
		// switch labeled( -> 쓴 것 ) expression

		// expression 은 statement 의 일부분.

		// switch case expression
		int val = 1;
		String res = switch (val) {
		case 1: {
			yield "값1";

		}

		case 2: {
			yield "값2";

		}
		case 3: {
			String r = "값" + val;
			yield r;
		}
		default: {
			yield "기본값";
		}
		};

		String res2 = switch (val) {
		case 1 -> "값1";
		case 2 -> "값2";
		case 3 -> {
			String r = "값" + val;
			yield r;
		}
		default -> "기본 값";
		};

	}
}
