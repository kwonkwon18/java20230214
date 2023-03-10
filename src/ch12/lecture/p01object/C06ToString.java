package ch12.lecture.p01object;

public class C06ToString {

	public static void main(String[] args) {
		Object o1 = new MyClass06("kwon", 29);
		Object o2 = new MyClass06("chan ", 88);

		System.out.println(o1.toString()); // 나이는 29 살이고 이름은 kwon
		System.out.println(o2.toString()); // 나이는 88 살이고 이름은 chan
	}

}

// toString을 재정의해서 원하는대로 값을 반환할 수 있다. 
class MyClass06 {
	private String name;
	private int age;

	public MyClass06(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {

		return "나이는 " + age + " 살이고 이름은 " + name;
	}
}
