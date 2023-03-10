package ch12.lecture.p01object;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C22HashCodeEquals {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add(new MyClass22(1, "권"));
		set.add(new MyClass22(2, "서"));
		set.add(new MyClass22(2, "서")); // ==> 다른 객체로 파악해버리는데 이를 방지하고 싶다.

		System.out.println(set.size()); // 2

	}

}

class MyClass22 {

	private int id;
	private String name;

	public MyClass22(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass22 other = (MyClass22) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
