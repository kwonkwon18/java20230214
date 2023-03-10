package ch07.lecture.p03cast;

public class C09Instanceof {

	public static void main(String[] args) {
		method1(new Animal());
		method1(new Horse());
		method1(new Fish());

	}

	public static void method1(Animal a) {
		a.breath();
		if (a instanceof Horse o1) {
			o1.run();
		} else if (a instanceof Fish o2) {
			o2.swim();
		} else {
			System.out.println("말도 피쉬도 아니다. ");
		}
	}
}
