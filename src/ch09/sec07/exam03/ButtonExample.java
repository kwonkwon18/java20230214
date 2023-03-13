package ch09.sec07.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// ok 버튼 객체 생성
		Button btnOk = new Button();

		// ok 버튼 객체에 clicklistener 구현 객체 주입
		btnOk.setClicklistener(new Button.Clicklistener() {

			@Override
			public void onClick() {
				System.out.println("오케이 버튼을 클릭했습니다.");

			}
		});

		// ok 버튼 클릭하기
		btnOk.click();

		// ======================

		// Cancel 버튼 생성
		Button btnCancel = new Button();

		btnCancel.setClicklistener(new Button.Clicklistener() {

			@Override
			public void onClick() {
				System.out.println("캔슬 버튼 클릭");

			}
		});

		btnCancel.click();

	}

}
