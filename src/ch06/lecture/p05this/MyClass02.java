package ch06.lecture.p05this;

public class MyClass02 {
	// 인스턴스 필드
	String name;

	// 인스턴스 메서드
	void printName() {
		String name = "park";
		// this ==> 참조변수를 대체하는 키워드 
		System.out.println(name); // 지역 변수
		System.out.println(this.name); // 인스턴스 변수

	}

	void setName(String name) {
		// 파라미터 name 을 필드 name 에 할당
		this.name = name;
	}

}
