package ch06.lecture.p07constructor;

public class C01Constructor {

	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		// 인스턴스 만들자마자 해야하는 일 (주로 필드 초기화)
		o1.name = "kwon";
		o1.age = 29;
		
		
		MyClass01 o2 = new MyClass01();
		o2.name = "sss";
		o2.age = 80;
		
		o1.descrip();
		o2.descrip();
		
	}

}
