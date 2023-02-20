package ch03.lecture.p06string;

public class C02Length {

	public static void main(String[] args) {
		//length
		//문자열의 길이를 확인하는 메소드
		// return type : int
		
		String str1 = "java";
		String str2 = "spring";
		String str3 = "hello world";
		String str4 = """
				동해물과 백두산이
				마르고 닳도록
				""";
		
		int len1 = str1.length();
		int len2 = str2.length();
		int len3 = str3.length();
		int len4 = str4.length();
		
	 System.out.println(len1);
	 System.out.println(str2.length());
	 System.out.println(str3.length());
	 System.out.println(str4.length());
		
		
	}

}
