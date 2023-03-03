package ch06.lecture.p11capsule;

public class C02Encapsulation {

	public static void main(String[] args) {
		MyClass02 o1 = new MyClass02();
		
//		o1.age = 3;
//		
//		o1.age = 30;
		
		System.out.println("나이 : " + o1.getAge()); // 0 (기본값) 
		o1.updateAge();
		
		System.out.println("나이 : " + o1.getAge());	 // 1	
		o1.updateAge();
		

	}

}
