package ch06.exercise.exam20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Account[] ac = new Account[100];
		Scanner sc = new Scanner(System.in);

		int n = 0; // 전역변수로 지정, 인덱스가 될 값

		while (true) {
			System.out.println("---------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택>");
			int choice = sc.nextInt(); // 내려줘야한다. nextInt 는 엔터를 안쳐줌
			sc.nextLine();

			switch (choice) {

			case 1: {
				if (n == 100) {
					System.out.println("더이상 입력불가");
					break;
				}
				System.out.print("계좌번호 : ");
				String str1 = sc.nextLine();

				System.out.print("계좌주 : ");
				String str2 = sc.nextLine();

				System.out.print("초기 입금액 : ");
				int num = sc.nextInt();
				sc.nextLine();
				ac[n] = new Account(str1, str2, num);
				System.out.println("결과 : 계좌가 생성되었습니다. ");
				n++;
				break;
			}

			case 2: {
				System.out.println("-------------------------");
				System.out.println("계좌목록");
				System.out.println("-------------------------");
				if (n == 0) {
					System.out.println("계좌없음");
					break;
				}
				for (int i = 0; i < n; i++) {
					System.out.println(ac[i].accountNum + "   " + ac[i].name + "   " + ac[i].balance);
				}
				break;
			}
			case 3: {
				System.out.println("-------------------------");
				System.out.println("예금");
				System.out.println("-------------------------");

				System.out.print("계좌번호 :");
				String a = sc.nextLine();

				System.out.print("예금액 :");
				int b = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < n; i++) {
					if (a.equals(ac[i].accountNum)) {
						ac[i].balance += b;
						break;
					}

				}
				break;
			}
			case 4: {
				System.out.println("-------------------------");
				System.out.println("출금");
				System.out.println("-------------------------");

				System.out.print("계좌번호 :");
				String a = sc.nextLine();

				System.out.print("출금액 :");
				int b = sc.nextInt();
				sc.nextLine();

				for (int j = 0; j < n; j++) {
					if (a.equals(ac[j].accountNum)) {
						ac[j].balance -= b;
						break;
					}

				}
				break;
			}

			case 5: {
				System.out.println("프로그램 종료");
				return;
			}
			}

		}

	}
}
