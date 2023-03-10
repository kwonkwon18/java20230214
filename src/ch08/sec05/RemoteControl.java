package ch08.sec05;

public interface RemoteControl {

	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상메서드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 인스턴스 메서드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리 합니다.");
			// 추상메서드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음해제 합니다. ");
		}
	}

}
