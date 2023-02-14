package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		int myhour = 3;
		int min = 5; // ctrl + 1 을 통해서 한번에 변수 이름을 바꿔줄 수 있다.
		System.out.println(myhour + "시간" + min + "분");
		System.out.println();

		int totalMinute = (myhour * 60) + min; // 선언과 초기화를 동시에 함.
		System.out.println("총" + totalMinute + "분");
	}
}
