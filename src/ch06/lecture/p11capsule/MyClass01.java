package ch06.lecture.p11capsule;

public class MyClass01 {

	private int age;

	public void setAge(int age) { // 다른 클래스에서 private int age 필드에 접근할 수 있는 메서드 제공
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public void desc() {
		System.out.println("나이는 " + age + " 살 입니다.");
	}

}
