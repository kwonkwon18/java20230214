package ch08.lecture.p05cast;

public class C01Cast {
	public static void main(String[] args) {
		
	MyClass011 o1 = new MyClass011();
//	o1.method1() xxx ==> Myinterface 에 없음

	// 강제 형변환
	MyClass011 o2 = (MyClass011) o1;

	o2.method1();
	
}
}
