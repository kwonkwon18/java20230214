package ch07.lecture.p01inheritance;

public class C06Polymorphism {

	public static void main(String[] args) {
		
		
		
		
		
		Sub06 o1 = new Sub06();

		Super06 o2 = o1; // ok

		Super06 o3 = new Sub06(); // ok
		// 밝은 무늬 재규어는 재규어다 느낌

//		Sub06 o4 = new Super06(); ==> 이건 안됨 
		// 마치 재규어는 밝은 무늬 재규어다 느낌

	}

}
