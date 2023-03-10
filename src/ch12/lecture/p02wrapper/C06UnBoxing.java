package ch12.lecture.p02wrapper;

public class C06UnBoxing {

	public static void main(String[] args) {
		int i1 = 30000;
		int i2 = 30000;

		Integer o1 = i1;
		Integer o2 = i2;

		int i3 = o1;
		int i4 = o2;

		System.out.println(i3 == i4); // true (unboxing 을 통해 기본타입의 비교가 되었다 )

		// 참조타입변수는 equals 를 꼭 써야함
	}

}
