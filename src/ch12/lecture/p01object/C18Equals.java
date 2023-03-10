package ch12.lecture.p01object;

public class C18Equals {

	public static void main(String[] args) {
		Object o1 = new String("java");
		Object o2 = new String("spring");
		Object o3 = new String("java");
		Object o4 = o1;
		
		System.out.println(o1.hashCode()); // 3254818
		System.out.println(o2.hashCode()); // -123324123
		System.out.println(o3.hashCode()); // 3254818
		System.out.println(o4.hashCode()); // 3254818
		
		System.out.println(o1.equals(o4)); // true
		System.out.println(o1.equals(o3)); // true
		System.out.println(o1.equals(o2)); // false
	}

}
