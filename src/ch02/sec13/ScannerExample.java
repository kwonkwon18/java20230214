package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("x 값 입력"); // println 이 아님 주의
		String strX = sc.nextLine();
		int x = Integer.parseInt(strX);

		System.out.print("y 값 입력"); // println 이 아님 주의
		String strY = sc.nextLine(); //--> nextint를 통해 한번에 해결 가능
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.print("x + y: " + result); // println 이 아님 주의, result 는 int 로 형변환 된 String의 합이다.
		System.out.println();

		while (true) {
			System.out.print("입력 문자열"); // println 이 아님 주의
			String data = sc.nextLine();
			if (data.equals("q")) {
				break;
			}
			System.out.println("출력문자열 " + data);
			System.out.println();
		}
		System.out.println("종료");

	}

}
