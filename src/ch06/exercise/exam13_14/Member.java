package ch06.exercise.exam13_14;

public class Member {

	private String name;
	private String id;
	private String password;
	private int age;
	private boolean married;

	// 14번
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	/////

	///////// getter & setter

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
