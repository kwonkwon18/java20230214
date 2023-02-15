package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println("result1: " + result1); // 30
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println("result2 : " + result2); //30
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000l;
		long result3 = v3 + v4 + v5;
		System.out.println("result3 : " + result3); // 1110
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4 : " + result4); // 66
		System.out.println("result4 : " + (char)result4); // B
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println("result5 : " + result5); // 2, 소수점 버림
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6 : " + result6); // 2.5
		
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11;
		System.out.println("resutl 7 :" + result7); // 0.5
		

	}

}
