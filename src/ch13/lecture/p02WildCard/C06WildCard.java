package ch13.lecture.p02WildCard;

public class C06WildCard {

	public static void main(String[] args) {
		MyClass06<Object> o1 = new MyClass06<>();
		MyClass06<Object> o2 = new MyClass06<String>(); // xx
		
		MyClass06<?> o3 = new MyClass06<Object>();
		MyClass06<?> o4 = new MyClass06<String>();
		
		
	}

}

class MyClass06<T>{
	public T item;
}