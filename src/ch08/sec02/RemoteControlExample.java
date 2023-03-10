package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new Television();
		tv.turnOn();

		RemoteControl audio = new Audio();
		audio.turnOn(); // 오디오를 켭니다
	}

}
