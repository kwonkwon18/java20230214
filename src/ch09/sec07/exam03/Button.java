package ch09.sec07.exam03;

public class Button {

	// 정적 멤버 인터페이스
	public static interface Clicklistener {
		// 추상 메서드
		void onClick();
	}
	
	// 필드
	private Clicklistener clickListener;
	
	//메서드
	public void setClicklistener(Clicklistener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}

}
