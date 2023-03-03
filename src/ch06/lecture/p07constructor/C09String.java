package ch06.lecture.p07constructor;

public class C09String {

	public static void main(String[] args) {
		
		// String 클래스의 다양한 생성자 오버로딩. 
		
		String s1 = new String();
		System.out.println(s1);

		String s2 = new String(new byte[] { 97, 98, 99 }); // 아스키 코드값
		System.out.println(s2); // abc

		String s3 = new String(new byte[] { 97, 98, 99 }, 1, 2); // 1번 ~ 2번 인덱스
		System.out.println(s3); // bc

		String s4 = new String(new char[] { '가', '나', '다', 'a', 'b' });
		System.out.println(s4); // 가나다ab

		String s5 = new String("hello");
		System.out.println(s5); // hello

	}

}
