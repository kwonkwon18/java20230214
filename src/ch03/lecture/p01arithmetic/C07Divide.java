package ch03.lecture.p01arithmetic;

public class C07Divide {

	public static void main(String[] args) {
		// 실수를 0으로 나누면 무한대 (infinity)
		
		double a = 0.0 ;
		double b = 3.0;
		
		double c = b/ a ;
		
		System.out.println(c); // Infinity 나옴
		
		double d = -3.0;
		
		double e = d / a;
		
		System.out.println(e); // -infinity 나옴
		
		// 실수를 0 으로 나눈 나머지 NaN
		double f = 3.0 % 0.0 ; 
		System.out.println(f); // NaN
		
		// 무한대인지 확인
		boolean isinfinity1 = Double.isInfinite(c);
		System.out.println(isinfinity1); // true
		
		boolean isinfinity2 = Double.isInfinite(3);
		System.out.println(isinfinity2); // false
		
		// NaN 인지 확인
		boolean isNan1 = Double.isNaN(f);
		System.out.println(isNan1); // true
		
		boolean isNan2 = Double.isNaN(2.0);
		System.out.println(isNan2); // false
		

	}

}
