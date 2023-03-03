package ch06.lecture.p03method;

public class C07Overloading {

	public static void main(String[] args) {
		MyClass07 o1 = new MyClass07();
		
		o1.method1(9);
		o1.method1(123123L);
		
		o1.method(1, 4);
		o1.method(1, "kwonkwon");
		o1.method("seo", 8);

	}

}
