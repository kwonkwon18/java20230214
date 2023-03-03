package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(); // s1객체라고 부름, 참조값만 가지고 있지만.
		System.out.println(s1); // ch06.sec04.Student@23fe1d71
		System.out.println("s1 변수가 Student 객체를 참조합니다. ");

		Student s2 = new Student();
		System.out.println(s2); // ch06.sec04.Student@28ac3dc3
		System.out.println("s2 변수가 또다른 student 객체를 참조합니다. ");

		System.out.println(s1 == s2); // false

		// 참조값 얻기 : System.identityHashCode(객체명);
		System.out.println(System.identityHashCode(s1)); // 603856241
		System.out.println(System.identityHashCode(s2)); // 682376643

	}

}
