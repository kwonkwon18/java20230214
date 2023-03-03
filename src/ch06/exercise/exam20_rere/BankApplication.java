package ch06.exercise.exam20_rere;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Account accounts[] = new Account[100];
		int index = 0;

		while (true) {
			System.out.println("===============================");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("===============================");

			System.out.print("선택>");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("===============================");
				System.out.println("계좌생성");
				System.out.println("===============================");

				System.out.print("계좌번호 : ");
				String str1 = sc.next();

				System.out.print("계좌주  : ");
				String str2 = sc.next();

				System.out.print("초기입금액 : ");
				int num1 = sc.nextInt();

				accounts[index] = new Account(str1, str2, num1);

				index++;

				System.out.println("계좌가 생성되었습니다. ");

				break;

			}
			case 2: {
				System.out.println("===============================");
				System.out.println("계좌목록");
				System.out.println("===============================");

				for (int i = 0; i < index; i++) {
					System.out
							.println(accounts[i].accountNum + "   " + accounts[i].name + "    " + accounts[i].balance);
				}
				break;
			}
			case 3: {
				System.out.println("===============================");
				System.out.println("예  금");
				System.out.println("===============================");

				System.out.println("계좌번호 :");
				String a = sc.nextLine();

				System.out.println("예금액 : ");
				int b = sc.nextInt();

				for (int i = 0; i < index; i++) {
					if (a.equals(accounts[i].accountNum)) {
						accounts[i].balance += b;
						break;
					}
				}
				break;
			}
			case 4: {
				System.out.println("===============================");
				System.out.println("출  금");
				System.out.println("===============================");

				System.out.println("계좌번호 :");
				String a = sc.nextLine();

				System.out.println("출금액 : ");
				int b = sc.nextInt();

				for (int i = 0; i < index; i++) {
					if (a.equals(accounts[i].accountNum)) {
						accounts[i].balance -= b;
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