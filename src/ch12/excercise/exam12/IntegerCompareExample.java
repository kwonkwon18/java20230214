package ch12.excercise.exam12;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 200;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		

	}

}
