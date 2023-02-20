package ch04.sec03;

public class example_2 {

	public static void main(String[] args) {
		String grade = "B";

		int score1 = switch (grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result; // result = score1 대신 yield result 해줘야함
		}
		default -> 60;
		};
		
		System.out.println(score1);
	}

}
