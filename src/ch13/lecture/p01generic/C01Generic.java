package ch13.lecture.p01generic;

public class C01Generic {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();

		o1.setItem("java");

		String s1 = null;
		Object o2 = o1.getItem();

		if (o2 instanceof String) {
			s1 = (String) o2;
		}

		System.out.println(s1);
	}

}

class MyClass01 {
//	item; ==> 타입이 아직 결정 안됨
	Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}
