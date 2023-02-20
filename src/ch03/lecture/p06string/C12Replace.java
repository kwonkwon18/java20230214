package ch03.lecture.p06string;

public class C12Replace {

	public static void main(String[] args) {
		// replace
		// 특정 문자열을 바꿀 때 사용
		// return type : String

		String str1 = "설악산, 백두산, 한라산";
		String res1 = str1.replace("산", "mountain");
		System.out.println(str1);
		System.out.println(res1);

		// 여러글자도 바꿀 수 있다.

		String str3 = str1.replace("설악", "성미");
		System.out.println(str3);

	}

}
