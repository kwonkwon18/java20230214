package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();

		// Car 객체의 필드값 읽기 ==> 선언만 해줬기 때문에 기본값으로 출력
		System.out.println("모델명 : " + myCar.model); // 모델명 : null
		System.out.println("출발여부 : " + myCar.start); // 출발여부 : false
		System.out.println("현재속도 : " + myCar.speed); // 현재속도 : 0

		Car yourCar = new Car();
		System.out.println("모델명 : " + yourCar.model); // 모델명 : null
		System.out.println("출발여부 : " + yourCar.start); // 출발여부 : false
		System.out.println("현재속도 : " + yourCar.speed); // 현재속도 : 0

		myCar.speed = 100;
		System.out.println(myCar.speed); // 100
		System.out.println(yourCar.speed); // 0

		Car hisCar = yourCar;

		yourCar.speed = 50; // 둘이 같은 참조값을 가지고 있기 때문에 값이 같다
		System.out.println(yourCar.speed); // 50
		System.out.println(hisCar.speed); // 50

		System.out.println(System.identityHashCode(hisCar)); // 1316061703 ( == yourCar)
		System.out.println(System.identityHashCode(yourCar)); // 1316061703 ( == hisCar)
		System.out.println(System.identityHashCode(myCar)); // 490150701

	}

}
