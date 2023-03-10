package ch08.sec05;

public class Television implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다");

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
		System.out.println("볼륨을 " + this.volume + "으로 합니다"); // this.volume으로 해야함 <== 객체가 가지고 있는 volume 필드값
	}

}
