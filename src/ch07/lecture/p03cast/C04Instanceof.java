package ch07.lecture.p03cast;

public class C04Instanceof {

	public static void main(String[] args) {
		// instanceof 연산자
		// 왼쪽항 : 참조변수 , 오른쪽항 : Type
		// 연산결과 boolean type
		// true : 왼쪽 항의 참조변수가 가리키는 변수가 오른쪽 항 type 이면
		// false : 아니면

		Sub04 o1 = new Sub04();

		boolean b1 = o1 instanceof Sub04; // true
		boolean b2 = o1 instanceof Super04; // true
		
		Super04 o2 = new Super04();
		
		boolean b3 = o2 instanceof Super04; // true
		boolean b4 = o2 instanceof Sub04; // false ==> 동물 인스턴스는 말이다 로 해석됨 (false) 
		
	}
}

class Sub04 extends Super04 {

}

class Super04 {

}
