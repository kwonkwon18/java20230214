package ch12.lecture.p02wrapper;

public class C03AutoBoxing {

	public static void main(String[] args) {
		Byte b = 3;
		Short s = 20000;
		Integer i = 200000;
		Long l = 99L;
		Float f = 3.14f;
		Double d = 3.14;
		Character c = '가';
		Boolean bool = true;

		Object o1 = b; // ==> 모든 포장 클래스는 Object 에 넣을 수 있다.

	}

}
