package ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		// 구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		// ride() 메서드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		// vehicle.run() -==> taxi.run() 만 실행됨
		System.out.println();
		ride(bus);
		// 형변환 후, bus.checkFare(), bux.run() 둘 다 실행됨
	}

	static void ride(Vehicle vehicle) {
		/*
		 * 방법 1 if(vehicle instanceof Bus) { Bus bus = (Bus) vehicle; bus.checkFare(); }
		 */

		// 방법 2 ==> 자바 12 이상부터 사용가능 , true가 되면 자동으로 형변환 해준다.
		if (vehicle instanceof Bus bus) {
			bus.checkFare();
		}

		vehicle.run();
	}

}
