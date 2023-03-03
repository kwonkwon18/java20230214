package ch06.lecture.p09package;

//import ch06.lecture.p09package.package1.*;
import static ch06.lecture.p09package.package1.MyClass05.name;
import static ch06.lecture.p09package.package1.MyClass05.method1;
import static ch06.lecture.p09package.package1.MyClass05.method2;

public class C07StaticImportAll {

	public static void main(String[] args) {

		
		// 각각 static 을 임포트 해주면 아래처럼 할 수는 있지만 조심해서 사용하자. 
		
		String n = name;
		method1();
		method2();

	}

}
