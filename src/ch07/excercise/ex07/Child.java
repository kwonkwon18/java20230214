package ch07.excercise.ex07;

public class Child extends Parent {

	public String name;

	public Child() {
		this("홍길동");
		System.out.println("Child() 호출");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) 호출");
	}

}
