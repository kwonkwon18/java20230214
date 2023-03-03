package ch06.lecture.p07constructor;

public class C08Overloading {

	public static void main(String[] args) {
		MyClass08 o1 = new MyClass08("권권", 29, "0118", false); // 생성자 1 호출
		MyClass08 o2 = new MyClass08("서서", 22, null, false); // 생성자 1 호출


		MyClass08 o3 = new MyClass08("재재", 25, false); // 생성자 2 호출
	}

}
