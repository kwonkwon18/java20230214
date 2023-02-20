package ch03.sec06;

public class CompareOpoeratorExamplt {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); 
		boolean result2 = (num1 != num2); 
		boolean result3 = (num1 <= num2); 
		System.out.println("result1 : " + result1); // true
		System.out.println("result2 : " + result2); // false
		System.out.println("result3 : " + result3); // true
		
		char char1 = 'A';
		char char2 = 'b';
		boolean result4 = (char1 < char2); // 65 < 66
		System.out.println("result4 : " + result4); // true, 유니코드로 변환되어 비교

		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4); 
		System.out.println("result5 : " + result5); // **true
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		System.out.println("result6 : " + result6); // false, 소수점까지 쳤기 때문
		System.out.println("result7 : " + result7); // true, 형변환 해주어 소수점까지
		
		String str1 = "자바";
		String str2 = "java";
		boolean result8 = (str1.equals(str2)); // 변수.equals()
		boolean result9 = (! str1.equals(str2)); // **문자열을 비교할 때는 !변수.equals()
		System.out.println("result8 : " + result8); //false
		System.out.println("result9 : " + result9); //true
		
		
	}

}
