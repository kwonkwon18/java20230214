package ch12.lecture.p02wrapper;

public class C05UnBoxing {

	public static void main(String[] args) {

		Integer i1 = 30; // auto boxing

		int i2 = 50;

		int i3 = i1 * i2; // ==> 산술 과정 중 i1이 unboxing
		int i4 = i1.intValue() * i2;

		System.out.println(i3);
	}

}
