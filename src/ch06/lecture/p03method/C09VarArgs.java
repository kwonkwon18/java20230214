package ch06.lecture.p03method;

public class C09VarArgs {

	public static void main(String[] args) {
		MyClass09 o1 = new MyClass09();
//
//		o1.method1();
//		o1.method1(1);
//
//		o1.method2(new int[] {});
//		o1.method2(new int[] { 3 });
//		o1.method2(new int[] { 9, 100 });

		// 가변길이 매개변수를 받는 메서드
		// 변수 길이를 잘 모를 때 유용하다.
		o1.method3();
		o1.method3(3, 3, 6, 3);
		o1.method3(3, 100);
		o1.method3(3);
		o1.method3(new int[] { 0, 4, 3, 6 });
	}

}
