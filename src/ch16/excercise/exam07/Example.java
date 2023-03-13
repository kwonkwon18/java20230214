package ch16.excercise.exam07;

public class Example {
	private static int scores[] = { 10, 50, 3 };

	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((x, y) -> Math.max(x, y));

//		int max = maxOrMin((x, y) -> ((x > y) ? x : y));

//		int max = maxOrMin((x, y) -> {
//			if (x > y) {
//				return x;
//			} else {
//				return y;
//			}
//		});

		System.out.println("최대값 : " + max);

		int min = maxOrMin((x, y) -> Math.min(x, y));

//		int min = maxOrMin((x, y) -> ((x < y) ? x : y));

//		int min = maxOrMin((x, y) -> {
//		if (x < y) {
//			return x;
//		} else {
//			return y;
//		}
//	});
		System.out.println("최소값 : " + min);
	}
}
