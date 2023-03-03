package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// smartphone 객체 생성
		SmartPhone myPhone = new SmartPhone("아이폰", "검은색");

		// Phone으로부터 상속받은 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);

		// smartphone의 필드 읽기
		System.out.println("와이파이 상태 : " + myPhone.wifi);

		// phone으로부터 상속받은 필드 호출
		myPhone.bell();
		myPhone.sendVoice("하이루 ");
		myPhone.receiveVoice("방가방가");
		myPhone.sendVoice("응 ~  ");
		myPhone.hangUp();

		// smartphone 메서드 호출
		myPhone.setWifi(true);
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		myPhone.internet();
	}

}
