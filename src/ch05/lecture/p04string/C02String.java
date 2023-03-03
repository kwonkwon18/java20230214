package ch05.lecture.p04string;

public class C02String {

	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = "java";
		String str3 = "java";

		System.out.println(str2 == str3); // true임..
		// String은 기본 타입의 형태를 띄고 있어서 str2, str3과 같이 리터럴한 값을 가지고 있는 경우는 같은 것으로 봄
		System.out.println(str1 == str2); // false

	}

}
