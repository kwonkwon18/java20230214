package ch13.sec05;

public class Course {

	// 모두 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + " 이 가 코스1을 등록함");
	}

	// 학생만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + " 이 가 코스2을 등록함");

		// 우변이 좌변의 하위 클래스이변 자동 형변환 가능
		Student a = applicant.kind;
		Person b = applicant.kind;

	}

	// 직장인 및 일만인만 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + " 이 가 코스3을 등록함");

		// 하위타입은 안전하게 들어갈 수 있다. (자동 형변환 )
		applicant.kind = new Worker();
		applicant.kind = new SubWorker();

	}

}

class SubWorker extends Worker {

}