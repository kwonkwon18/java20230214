package ch07.lecture.p03cast;

public class C05Instanceof {

	public static void main(String[] args) {
		method1(new Sub05());
//		true
//		true

		method1(new Super05());
//		true
//		false

	}

	public static void method1(Super05 s) {
		System.out.println(s instanceof Super05);
		System.out.println(s instanceof Sub05); // 그때그때 다르다. s 에 Sub05가 들어오면 자동 형변환 되므로 true
		// 실제 가르키고 있는 인스턴스의 타입이 뭔지가 중요
	}

}

class Super05 {

}

class Sub05 extends Super05 {

}