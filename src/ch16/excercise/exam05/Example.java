package ch16.excercise.exam05;

import java.util.Set;

public class Example {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickListener(() -> {
			System.out.println("ok 버튼을 클릭했습니다. ");
		});
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(() ->{
			System.out.println("캔슬 버튼을 클릭했습니다. ");
		});
		btnCancel.click();
		

	}

}
