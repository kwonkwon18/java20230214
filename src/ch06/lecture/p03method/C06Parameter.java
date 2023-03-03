package ch06.lecture.p03method;

public class C06Parameter {

	public static void main(String[] args) {
		// 자동 형 변환
		int a = 3; 
		long b = a; 
		double c = b; 
		
		MyClass06 o1 = new MyClass06();
		
		o1.method1(33); // 가능
		o1.method1('c'); // 가능함, 자동형변환
		
		// 아래 모두 자동형변환 가능
		o1.method2(123123123123L);
		o1.method2(33);
		o1.method2('d');
		
		
		// 아래 모두 자동형변환 가능 
		o1.method3(3.14);
		o1.method3(124124124214L);
		o1.method3('d');
		
		
		o1.method4(3.14f); // 가능
		o1.method4(1231424L); // 가능
		o1.method4(99); // 가능
//		o1.method4(3.14); // 안되고 ==> double 타입으로 float 로 정의했을 때는 자동형변환이 안된다. 
		

	}

}
