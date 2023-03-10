package ch08.excercise.exam05;

public class TV implements Remocon {
	@Override
	public void powerOn() {
		System.out.println("tv 가 켜졌습니다. ");
	}
	
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}
}
