package ch02.sec09;

public class StringConcatExample {
	public static void main(String[] args) {
		
		int result1 = 10 + 2 + 8;
		System.out.println(result1);
		
		String result2 = 10 + "2" + 8; 
		System.out.println(result2);
		
		String result3 = 10 + 2 + "8"; // 앞의 두개는 숫자로 인식, 뒤의 1개 스트링
		System.out.println(result3);
		
		String result4 = "10" + 2 + 8; // 먼저 String 이 나오면 전체가 스트링으로 인식되서 더해진다.  
		System.out.println(result4);
		
		String result5 = "10" + (2+8); // 괄호 안의 연산 먼저
		System.out.println(result5);
	}
}
