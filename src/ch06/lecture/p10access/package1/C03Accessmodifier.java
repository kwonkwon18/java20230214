package ch06.lecture.p10access.package1;

public class C03Accessmodifier {

	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03(); // 퍼블릭 , 모두 접근 가능
		MyClass03 o2 = new MyClass03("헬로"); // 디폴트 , 같은 패키지 안이라서 접근 가능
//		MyClass03 o2 = new MyClass03(3); 프라이빗, 다른 클래스라 접근 불가

	}

}
