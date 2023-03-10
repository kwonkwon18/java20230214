package ch12.lecture.p01object;

import java.util.Objects;

public class C20HashcodeEquals {
	public static void main(String[] args) {

		Object o1 = new MyClass20(1, "kim", "seoul", false);
		Object o2 = new MyClass20(1, "kim", "seoul", false);
		
		System.out.println(o1.hashCode()); // 1293458344
		System.out.println(o2.hashCode()); // 1293458344
		
		System.out.println(o1.equals(o2)); // true
		
		System.out.println(System.identityHashCode(o1)); // 1316061703
		System.out.println(System.identityHashCode(o2)); // 490150701

	}
}

class MyClass20 {
	private int id;
	private String name;
	private String address;
	private boolean merried;

	public MyClass20(int id, String name, String address, boolean merried) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.merried = merried;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, merried, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass20 other = (MyClass20) obj;
		return Objects.equals(address, other.address) && id == other.id && merried == other.merried
				&& Objects.equals(name, other.name);
	}

}
