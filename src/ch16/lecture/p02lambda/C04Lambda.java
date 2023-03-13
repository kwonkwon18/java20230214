package ch16.lecture.p02lambda;

public class C04Lambda {
	public static void main(String[] args) {
		MyInterface04 o1 = new MyInterface04() {
			@Override
			public void method(int x, int y) {

				System.out.println("익명 클래스 ");
				System.out.println(x + " , " + y);

			}
		};
		o1.method(1, 2);

		MyInterface04 o2 = (int x, int y) -> {
			System.out.println("람다식 ");
			System.out.println(x + " , " + y);
		};
		o2.method(3, 5);

		MyInterface04 o3 = (x, y) -> {
			System.out.println("타입 생략한 람다식 ");
			System.out.println(x + " , " + y);

		};
		o3.method(77, 24);
	}

}

interface MyInterface04 {
	void method(int x, int y);
}
