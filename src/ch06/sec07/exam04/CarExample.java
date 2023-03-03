package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {
		

		
		Car car1 = new Car(); // 생성자 1 호출

		System.out.println("car1.company : " + car1.company); // car1.company : 현대자동차
		System.out.println();

		Car car2 = new Car("자가용"); // 생성자 2 호출

		System.out.println("car2.company : " + car2.company); // car2.company : 현대자동차
		System.out.println("car2.model : " + car2.model); // car2.model : 자가용
		System.out.println();

		Car car3 = new Car("자가용", "빨간색"); // 생성자 3 호출

		System.out.println("car3.company : " + car3.company); // car3.company : 현대자동차
		System.out.println("car3.model : " + car3.model); // car3.model : 자가용
		System.out.println("car3.color : " + car3.color); // car3.color : 빨간색
		System.out.println();

		Car car4 = new Car("자가용", "빨간색", 200); // 생성자 4 호출

		System.out.println("car4.company : " + car4.company); // car4.company : 현대자동차
		System.out.println("car4.model : " + car4.model); // car4.model : 자가용
		System.out.println("car4.color : " + car4.color); // car4.color : 빨간색
		System.out.println("car4.maxSpeed : " + car4.maxSpeed); // car4.maxSpeed : 200

	}

}
