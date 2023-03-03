package ch06.lecture.p03method;

public class C05Parameter {

	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();

		o1.method1(); // 파라미터 없는 메서드

		o1.method2(2, 3); // 2 + 3 = 5

		o1.method3(5); // 받은 파라미터만큼 별 찍기

//		*
//		**
//		***
//		****
//		*****

		o1.method4(4); // 12
		o1.method4(9); // 27
	}

}
