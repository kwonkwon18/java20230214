package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// 자식객체 생성
		Child child = new Child();

		// 자동 타입 변환
		Parent parent = child;

		// 메서드 호출
		parent.method1();
		parent.method2();
//		parent.method3(); 이건 안됨..! parent 는 method3이 있는지 모른다. 

		System.out.println(child); // ch07.sec07.exam02.Child@28ac3dc3
		System.out.println(parent); // ch07.sec07.exam02.Child@28ac3dc3
	}

}
