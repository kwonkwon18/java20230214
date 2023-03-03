package ch06.lecture.p02field;

public class C03Field {

	public static void main(String[] args) {
		MyClass03 var1 = new MyClass03();
		MyClass03 var2 = new MyClass03();
		
		System.out.println(var1.name);
		System.out.println(var1.height);

		
		System.out.println(var2.name);
		System.out.println(var2.height);
		
		var1.name = "kwon";
		var1.height = 190;

		System.out.println(var1.name); // kwon
		System.out.println(var1.height); // 190
		
		
		System.out.println(var2.name); // seo
		System.out.println(var2.height); // 0
	}

}
