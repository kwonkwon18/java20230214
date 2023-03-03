package ch05.sec07;

import java.util.Scanner;

public class example_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = null;
		int sum = 0;

		while (true) {
			System.out.println("=================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("=================");

			System.out.print("선택>");

			int input = sc.nextInt();

			if (input == 1) {
				System.out.print("학생수>");
				int students = sc.nextInt();
				arr = new int[students];
			}

			if (input == 2) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print("score[" + i + "] : ");
					arr[i] = sc.nextInt();
				}

			}
			if (input == 3) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println("score[" + i + "] : " + arr[i]);
				}
			}
			if (input == 4) {
				int max = arr[0];
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
					if (max < arr[i]) {
						max = arr[i];
					}
				}
				double avg = sum / arr.length;
				System.out.println("최고점수" + max);
				System.out.println("평균점수" + avg);

			}
			if (input == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
