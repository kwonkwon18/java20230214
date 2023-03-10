package ch13.ch13.excercise.exam02;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		
		Container<Integer> container2 = new Container<>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);

	}

}

class Container<T> {
	private T item;

	public void set(T item) {
		this.item = item;
	}

	public T get() {
		return item;
	}

}
