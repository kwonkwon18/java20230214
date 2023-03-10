package ch08.lecture.p05cast;

public class C02Instance {
	public static void main(String[] args) {
		MyInterface02 o1 = new MyClass021();
		MyInterface02 o2 = new MyClass022();
		if (o1 instanceof MyClass021) {
			MyClass021 o3 = (MyClass021) o1; // ok
			System.out.println("형변환됨");
		}

		if (o2 instanceof MyClass022) {
			MyClass022 o4 = (MyClass022) o2; // ok
			System.out.println("형변환됨");
		}

		if (o1 instanceof MyClass022) {
			MyClass022 o5 = (MyClass022) o1; // xxx (문법 오류는 아님)
			System.out.println("형변환됨");
		}

		System.out.println("다음 실행 흐름 이어짐 ");

	}

}
