package ch09.sec07.exam02;

public class Home {
	// 필드에 익명 구현 객체 대입

	private RemoteControl rc = new RemoteControl() {
		public void turnOff() {
			System.out.println("tv를 끕니다.");
		}

		public void turnOn() {
			System.out.println("tv를 켭니다.");
		}
	};

	// 메서드(필드 이용)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}

	// 메서드(로컬 변수 이용)
	public void use2() {
		// 로컬 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다");

			}

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다");

			}
		};
		rc.turnOn();
		rc.turnOff();
	}

	// 메서드 (매개변수 이용) 
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
