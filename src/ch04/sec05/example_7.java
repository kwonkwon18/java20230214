package ch04.sec05;

import java.util.Scanner;

public class example_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total = 0; // while 문 안에 넣어주면 계속 초기화함
		
		while (true) {

			System.out.println("==============================");
			System.out.println("1. 예금 |2. 출금 |3. 잔고 |4. 종료");
			System.out.println("==============================");
			System.out.print("선택> ");
			System.out.println();
			int val = sc.nextInt();

			if (val == 1) {
				System.out.print("예금액 >");
				total += sc.nextInt();
				continue;
			} else if (val == 2) {
				System.out.print("출금액 >");
				total -= sc.nextInt();
				continue;
			} else if (val == 3) {
				System.out.print("잔고액 >" + total);
				System.out.println();
				continue;
			} else if (val == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}