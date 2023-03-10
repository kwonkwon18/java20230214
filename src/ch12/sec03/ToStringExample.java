package ch12.sec03;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone smartphone = new SmartPhone("삼성", "안드로이드");

		String strObj = smartphone.toString();
		System.out.println(strObj);

		System.out.println(smartphone); // ==> Object의 toString을 재정의 해줬기 때문에 객체 호출을 통해서 내용을 출력 가능
		// 객체의 문자정보를 리턴할 수 있도록 함.

	}

}
