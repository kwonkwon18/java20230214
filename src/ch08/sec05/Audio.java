package ch08.sec05;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("볼륨을 " + this.volume + "으로 합니다");
	}

	// 필드
	private int memoryVolume; // 추가 필드 선언

	@Override // 디폴트 메서드 오버라이딩
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음처리합니다. ");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음해제합니다.");
			setVolume(this.memoryVolume);
		}
	}

}
