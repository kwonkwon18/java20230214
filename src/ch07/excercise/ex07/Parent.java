package ch07.excercise.ex07;

public class Parent {

	public String nation;

	public Parent() {
		this("대한민국");
		System.out.println("Parent() 호출");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) 호출");
	}

}
