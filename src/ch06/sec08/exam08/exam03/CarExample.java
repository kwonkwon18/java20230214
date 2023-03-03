package ch06.sec08.exam08.exam03;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();

		// 리턴값이 없는 setGas() 메서드 호출
		myCar.setGas(5);

		// ifLeftGas() 메서드를 호출해서 받은 리턴값이 true 일 경우 if 블록 실행
		if (myCar.isLeftGas()) { // myCar.isLeftGas() 가 ture 일때 메서드가 호출됨 ==> "gas가 있습니다." 를출력하고 ture 로 반환됨
			System.out.println("출발합니다. ");

			// 리턴값이 없는 run() 메서드 호출
			myCar.run();
		}
		System.out.println("gas 를 주입하세요 ");

	}

}
