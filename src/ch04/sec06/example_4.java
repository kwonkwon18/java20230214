package ch04.sec06;

public class example_4 {

	public static void main(String[] args) {
		// for , 두개 주사위 , 랜덤, (눈1,눈2 출력)
		// 두 눈의 합이 5면 stop

		for (int i = 0; i >= 0; i++) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			if (num1 + num2 == 5) {
				System.out.println(num1 + " , " + num2);
				System.out.println("종료되었습니다. ");
				break;
			} else {
				System.out.println(num1 + " , " + num2);
				continue;
			}
		}
	}

}
