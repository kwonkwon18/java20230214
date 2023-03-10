package ch12.lecture.p01object;

public class C11Enum {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);

		Season s1 = Season.SPRING;
		Season s2 = Season.SUMMER;
		Season s3 = Season.FALL;
		Season s4 = Season.WINTER;

		// 작성한 인덱스 찾기
		System.out.println(s1.ordinal()); // 0
		System.out.println(s2.ordinal()); // 1
		System.out.println(s3.ordinal()); // 2
		System.out.println(s4.ordinal()); // 3
		
		Season s5 = Season.valueOf("SPRING");
		System.out.println(s5);
	}
}

enum Season {
	SPRING, SUMMER, FALL, WINTER
}