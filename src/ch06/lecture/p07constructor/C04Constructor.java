package ch06.lecture.p07constructor;

public class C04Constructor {

	public static void main(String[] args) {
		MyClass04 o1 = new MyClass04("abc", 29999); // ==> 생성자에 해당 값을 넣어서 필드 초기화해줌
		MyClass04 o2 = new MyClass04("def", 50000); // ==> 생성자에 해당 값을 넣어서 필드 초기화해줌

		o1.desc();
		// 모델명 : abc
		// 가격 : 29999

		o2.desc();
		// 모델명 : def
		// 가격 : 50000

	}

}
