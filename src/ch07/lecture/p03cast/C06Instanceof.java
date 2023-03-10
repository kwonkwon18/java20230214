package ch07.lecture.p03cast;

public class C06Instanceof {

	public static void main(String[] args) {
		Super06 o1 = new Sub06(); // 자동형변환
		Super06 o3 = new Super06();
		Sub06 o4 = new Sub06();

		// method1 실행시키고 싶어 !
//		o1.method1  ==> 이거 안됨

//		Sub06 o2 = (Sub06) o1; // ==> 위험한 코드임

		if (o1 instanceof Sub06) { // 이렇게 확인후에 진행
			Sub06 o2 = (Sub06) o1;
			o2.method1();
		}
	}
}

class Super06 {

}

class Sub06 extends Super06 {
	public void method1() {
		System.out.println("sub06 method1");
	}
}
