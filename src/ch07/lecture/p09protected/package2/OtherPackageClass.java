package ch07.lecture.p09protected.package2;

import ch07.lecture.p09protected.package1.*;

public class OtherPackageClass {
	public void someMethod() {
		Super01 o1 = new Super01();
		o1.method1(); // Super01 클래스의 method1 은 protected 로 되어있어, 다른 패키지기 때문에 안됨
		
	}
}
