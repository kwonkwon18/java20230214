package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.drive(bus); // 자동 타입 변환 발생 , Vehicle vehicle = bus;
		
		driver.drive(new Taxi());

	}

}
