package ch12.lecture.p01object;

public class C19Equals {
	public static void main(String[] args) {
		Object o1 = new MyClass19(11);
		Object o2 = new MyClass19(22);
		Object o3 = new MyClass19(22);

		System.out.println(o1.hashCode()); // 11
		System.out.println(o2.hashCode()); // 22
		System.out.println(o3.hashCode()); // 22

		System.out.println(o1.equals(o2)); // false
		System.out.println(o1.equals(o3)); // false
		System.out.println(o2.equals(o3)); // true

	}

}

class MyClass19 {
	private int id;

	MyClass19(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof MyClass19 o) {
			return this.id == o.id;
		}
		return false;
	}
}