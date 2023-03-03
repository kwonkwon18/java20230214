package ch06.sec07.exam04;

public class Car {

	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 아래는 모두 생성자 오버로딩의 예시. 
	
	// 생성자 선언
	Car() { // 기본 생성자
		System.out.println("생성자 1 호출");
	} 

	Car(String model) { // 파라미터가 1개인 생성자 
		System.out.println("생성자 2 호출");
		this.model = model;
	}

	Car(String model, String color) { // 파라미터가 2인 생성자 
		System.out.println("생성자 3 호출");
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) { // 파라미터가 3인 생성자 
		System.out.println("생성자 4 호출");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

}
