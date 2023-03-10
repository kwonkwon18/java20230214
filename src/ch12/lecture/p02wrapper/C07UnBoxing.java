package ch12.lecture.p02wrapper;

public class C07UnBoxing {

	public static void main(String[] args) {
		Integer i1 = 30000;
		int r1 = i1 + 50000;
		System.out.println(r1); // 80000

		Object o1 = 30000;
//		int r2 = o1 + 50000; 이건 안됨, Objcet 타입은 연산 불가 

		int r3 = ((Integer) o1) + 3000; // 되긴하지만 위험한 코드이다.

		System.out.println(r3);// 33000

	}

}
