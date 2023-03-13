package ch16.excercise.exam08;

public class Example {
	// 배열 생성
	private static Student students[] = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};

	// avg() 메서드 작성
	static private double avg(Function<Student> fun) {
		double sum = 0;
		for (Student s : students) {
			double score = fun.apply(s);
			sum += score;
		}
		return sum / students.length;
	}

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어평균점수 : " + englishAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학평균점수 : " + mathAvg);

	}

}
