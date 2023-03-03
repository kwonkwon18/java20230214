package ch06.lecture.p02field;

public class C02Field {

	public static void main(String[] args) {
		MyClass02 var1 = new MyClass02();

		// 초기화하지 않아도 필드는 사용할 수 있다. (초기값으로 나옴)
		System.out.println(var1.age); // 0
		System.out.println(var1.married); // false
		System.out.println(var1.name); // null

//		int a;
//		System.out.println(a); ==> 초기화 하지 않은 변수 사용 불가 

	}

}
