package ch06.sec07.exam05;

public class Car {

	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자 선언

	Car(String model) { // 파라미터가 1개인 생성자
		this(model, "은색", 250);
	}

	Car(String model, String color) { // 파라미터가 2인 생성자
		this(model, color, 250);
	}

	Car(String model, String color, int maxSpeed) { // 파라미터가 3인 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

}
