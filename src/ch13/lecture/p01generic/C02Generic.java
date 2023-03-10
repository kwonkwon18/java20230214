package ch13.lecture.p01generic;

import java.util.Scanner;

public class C02Generic {
	public static void main(String[] args) {
		MyClass02<String> o1 = new MyClass02(); // 여기서만 string을 사용함

		o1.setItem("java");

		String s1 = o1.getItem();
		System.out.println(s1.length());

		MyClass02<Scanner> o2 = new MyClass02<>();
		o2.setItem(new Scanner(""));
		Scanner sc = o2.getItem();

//		MyClass02<int> o3 = new MyClass02<>(); ==> 기본타입은 안됨

		MyClass02<Integer> o3 = new MyClass02<>(); // ==> wrapper 타입은 오케이
		o3.setItem(33);
		System.out.println(o3.getItem()); // 33

	}

}

// generic type
// T : type parameter
// type parameter 작성 관습 : 대문자 한글자 
class MyClass02<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}