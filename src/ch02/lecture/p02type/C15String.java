package ch02.lecture.p02type;

public class C15String {

	public static void main(String[] args) {
		// String과 기본 타입과의 연산
		// + 외에 안됨

		String s1 = "3";
		String s2 = "4";

//		System.out.println(s1 *s2); //안됨

		int i3 = 3;
		String s3 = "4";

//		int r3 = i3 + s3; 안됨 
		String r3 = i3 + s3;
		System.out.println(r3); // 34
		System.out.println(3.14 + "hello"); // 3.14hello

		String r4 = 3 + 3 + "4"; 
		System.out.println(r4); // 64

		String r5 = "3" + 3 + 4;
		System.out.println(r5); //334
		
		// 기본타입 -> 스트링
		// valueOf
		// 연결연산
		
		boolean b8 = false;
		String s8 = String.valueOf(b8);
		String s9 = b8 + "";
		System.out.println(s8);
		System.out.println(s9);
	}

}
