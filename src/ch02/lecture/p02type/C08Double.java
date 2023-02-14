package ch02.lecture.p02type;

public class C08Double {
	public static void main(String[] args) {
		// 실수 
		// float(4바이트) double(8바이트)
		
		int i1 = 3;
		
//		i1 = 3.14;  정수형태의 자료값이라 실수가 들어가면 안됨
		
		double d1 = 3.14; // 실수형태의 자료값 
		d1 = 99999;
		
		float f1 = 3.14f; // 실수는 기본적으로 double 로 간주하기 때문에, f를 붙여줘야함.
		f1 = 3; // 얘는 정수니까 그냥 됨
		
		// 사용시 주의
		// 10진법 -> 2진법으로 바꿔서 저장
		// 
		
		double d2 = 0.1 ;
		double d3 = 0.2 ;
		
		double d4 = d2 + d3;
		System.out.println(d4); // 근사한 값으로 오차가 나오게 됨, 10 진수를 2진수로 변환하면서 생기는 차이값에 의한다.
	}
}
