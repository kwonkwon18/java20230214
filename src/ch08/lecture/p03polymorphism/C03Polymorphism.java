package ch08.lecture.p03polymorphism;

public class C03Polymorphism {
	public static void main(String[] args) {
		// CharSequence 인터페이스를 구현한 메서드들
		// (String, StringBuffer, StringBuilder는 안전하게 실행 가능하다)
		CharSequence[] arr = new CharSequence[10];

		arr[0] = new String("java");
		arr[1] = "hello";
		arr[2] = new StringBuffer();
		arr[3] = new StringBuilder();

		char c1 = arr[0].charAt(0);
		char c2 = arr[1].charAt(0);
		char c3 = arr[2].charAt(0);
		char c4 = arr[3].charAt(0);

	}
}
