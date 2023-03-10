package ch13.lecture.p01generic;

public class C04GenericType {
	public static void main(String[] args) {

		MyClass04<String, Integer, Double> o1 = new MyClass04<>();

		o1.setItem("hello");
		o1.setItem1(11);
		o1.setItem3(3.13);

		String s1 = o1.getItem();

		System.out.println(s1);

	}
}

class MyClass04<T, S, U> {
	private T item;
	private S item1; // ==> 다른 타입으로 정의해주고 싶다.
	private U item3;

	public U getItem3() {
		return item3;
	}

	public void setItem3(U item3) {
		this.item3 = item3;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public S getItem1() {
		return item1;
	}

	public void setItem1(S item1) {
		this.item1 = item1;
	}

}