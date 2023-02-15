package ch02.lecture.p02type;

public class C12Casting {

	public static void main(String[] args) {
		
		// 정수끼리, 실수끼리
		// 큰타입 -> 작은타입 : 강제형변환(casting)
		int i1; // 4바이트
		long l1; // 8바이트
		
		l1 = 30;
//		i1 = l1; 오류 발생 !!
		i1 = (int) l1;
		
		System.out.println(i1); // 30
		
		l1 = 3000000000L;
		i1 = (int) l1;
		System.out.println(i1); // 다른 값이 나옴(int 표현 한계를 넘음)
		
		short s1;
		byte b1;
		
		s1 = 200;
		b1 = (byte)s1;
		System.out.println(s1);
		System.out.println(b1); // -56 , 다른 값이 나옴
		
		// 실수 -> 정수 : 강제형변환(casting)
		
		double d2;
		int i2;
		
		d2 = 3.14;
//		i2 = d2; 강제 형변환 해줘야함
		i2 = (int)d2;
		System.out.println(i2); // 정수부분만 남기고 지워준다.. 여러 곳에서 응용 가능함
		
		
	}

}
