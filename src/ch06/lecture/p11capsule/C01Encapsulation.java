package ch06.lecture.p11capsule;

public class C01Encapsulation {

	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();

//		o1.age = 29; age 가 프라이빗 필드가 접근 안됨
		o1.setAge(29);
		o1.desc();
//		o1.age = -1;  이런 상황을 방지하고 싶음
		o1.setAge(-1);
		o1.desc();

	}

}
