package ch06.lecture.p10access.package1;

public class MyClass03 {
	// 생성자 접근 예시

	// 어디서든 접근 가능
	public MyClass03() {
		System.out.println("퍼블릭");
	}

	// 같은 클래스 내에서만
	private MyClass03(int i) {
		System.out.println("프라이빗");

	}

	// 같은 패키지 내에서만
	MyClass03(String s) {
		System.out.println("디폴트");

	}
	
	public void method() {
		MyClass03 o1 = new MyClass03();
		MyClass03 o2 = new MyClass03(3);
		
	}

}
