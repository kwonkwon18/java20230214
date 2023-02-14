package ch02.lecture.p02type;

public class C07Char {
	public static void main(String[] args) {
		//char (문자)
		//하나의 문자값 저장
		//2바이트 (16비트)
		//0 ~ 65535까지 표현가능 (unicode) (수를 표현하는것이 아니므로 음수 없음) 
		
		char c1 = 65261;
		
//		char c2 = ''; xx 하나의 문자만
//		char c3 = 'ab'; xx 하나의 문자만
		
		char c4 = 'a';
		char c5 = 'b';
		
		System.out.println(c1);
		System.out.println(c4-c5); // 연산이 된다. 
		
		
	}
}
