package ch02.lecture.p02type;

public class C13Expression {

	public static void main(String[] args) {
		// 연산 중 자동 형변환
		
		byte b1 = 30;
		byte b2 = 10;
		
//		byte b3 = b1 + b2 ; //byte, short, int의 연산 결과는 int
		
		int b3 = b1 + b2; // 이건 가능
		
		byte b4 = (byte) (b1 + b2) ; // 강제 형변환 해주면 가능
		
		// 정수간의 연산에서 long 이 포함된 연산의 결과는 long
		
		long l6 = 30;
		long l7 = 10;
		
//		int it = l6 + l7; long 타입의 연산결과를 반환하므로 실행x
		
		int i9 = 20;
//		int i9 = l6 + i9 // long 타입으로 반환하므로 실행x
				
		// 정수와 실수끼리 연산 결과는 실수이다. 
		
		int i11 = 30;
		double d11 = 3.14;
		
//		int i11 = i11 + d11 이런 연산은 실수이다. 
		
		

	}

}
