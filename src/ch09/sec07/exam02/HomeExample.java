package ch09.sec07.exam02;

public class HomeExample {

	public static void main(String[] args) {
		// Home 객체 생성
		Home home = new Home();

		// 익명 구현 객체가 대입된 필드 사용
		home.use1();
		/*
		tv를 켭니다.
		tv를 끕니다.
		*/
		
		// 익명 구현객체가 대입된 로컬 변수 사용
		home.use2();
		/*
		에어컨을 켭니다
		에어컨을 끕니다
		*/
		
		// 익명 구현 객체가 대입된 매개변수 사용
		home.use3(new RemoteControl() {
			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다");

			}

			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다");

			}
		});
		/*
		난방을 켭니다
		난방을 끕니다
		*/
		

	}

}
