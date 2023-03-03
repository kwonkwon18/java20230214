package ch06.lecture.p03method;

public class C13Return {

	public static void main(String[] args) {
		MyClass13 o1 = new MyClass13();

		o1.method1(); // 리턴한 값으로 치환되므로 3으로 변환된 것과 다름 없다.

		int var1 = o1.method1();
		System.out.println(var1); // 3

		int var2 = o1.method1() * 2;
		System.out.println(var2); // 6

		String var3 = o1.method2();
		System.out.println(var3); // hello

		String var4 = o1.method2() + "java";
		System.out.println(var4); // hellojava

		// 자동형변환
//		short var5 = o1.method1(); 안됨
		long var5 = o1.method1(); // 가능 long = int 형변환
	}

}
