package ch07.lecture.p03cast;

public class C02Cast {

	public static void main(String[] args) {
		
		
		Super02 o1 = new Sub02();
		System.out.println(System.identityHashCode(o1)); // 682376643

		Sub02 o2 = (Sub02) o1;
		System.out.println(System.identityHashCode(o2)); // 682376643

		Super02 o3 = new Super02();
		System.out.println(System.identityHashCode(o3));
		

//		Sub02 o4 = (Sub02) o3; 문법상의 오류는 아니지만 exception 이 발생함 , 재규어는 밝은 재규어다..
		// 슈퍼 클래스를 서브 클래스로 캐스팅 할 수 없다.

		System.out.println("실행코드 이어짐 ");
	}

}

class Super02 {

}

class Sub02 extends Super02 {

}
