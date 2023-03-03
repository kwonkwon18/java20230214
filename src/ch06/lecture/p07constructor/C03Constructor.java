package ch06.lecture.p07constructor;

public class C03Constructor {

	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();

		o1.descript(); // 이름 : kwon나이 77 ==> 생성자에서 초기화를 해놨기 때문에 해당 출력이 됨

		o1.name = "권권";
		o1.age = 19;

		o1.descript(); // 이름 : 권권나이 19 ==> 바뀌어서 출력
	}

}
