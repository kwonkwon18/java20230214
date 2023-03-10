package ch13.lecture.p01generic;

public class C08Bound {

	public static void main(String[] args) {
		MyClass08<Integer> o1 = new MyClass08<>(99);
		o1.handleItem();
		
		MyClass08<Double> o2 = new MyClass08<>(3.14);
		o2.handleItem();
		
		// 안됨
//		MyClass08<String> o3 = new MyClass08<>("java");
		

	}

}

// bounded type parameter : 상한선이 있는 파라미터
// Number와 관련된 것으로 제네릭을 제한하고 싶을 때
class MyClass08<T extends Number> {
	private T item;

	public MyClass08(T item) {
		super();
		this.item = item;
	}

	public void handleItem() {
		String str = item.toString();
		int hash = item.hashCode();
		boolean eq = item.equals(null);
		
		// item 이 number 또는 그 하위타입 이므로
		// Number 의 메서드를 실행할 수 있음 
		int i = item.intValue();
		double d = item.doubleValue();

		
		/*
		if(item instanceof Number numItem) {
		int i = numItem.intValue();
		double d = item.doubleValue();
		}
		*/
	}

}
