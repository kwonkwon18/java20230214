package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		//ok버튼 객체 생성
		Button btnOk = new Button();
		
		// Ok 버튼 객체에 람다식 주입
		btnOk.setClickListener(() -> System.out.println("버튼을 클릭했습니다. "));
		btnOk.click();

		
		// Cancle 버튼 객체 생성
		Button btnCancle = new Button();
		
		// Cancle 버튼 객체에 람다식 주입
		btnCancle.setClickListener(() -> {
			System.out.println("캔슬 버튼 클릭");
		});
		
		btnCancle.click();
	}

}
