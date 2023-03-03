package ch06.exercise.exam20_re;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Account accounts[] = new Account[100];
		Scanner sc = new Scanner(System.in);
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

				Account account = new Account();
				System.out.print("계좌번호 : ");
				String str1 = sc.next();
				System.out.print("계좌주 : ");
				String str2 = sc.next();
				System.out.print("초기입금액 : ");
				int num1 = sc.nextInt();
				sc.nextLine();

				account.setAccountNum(str1);
				account.setName(str2);
				account.setBalance(num1);

				accounts[index] = account;
				index++;
				break;
			}
			case 2: {
				System.out.println("===============================");
				System.out.println("계좌목록");
				System.out.println("===============================");

				for (int i = 0; i < index; i++) {
					System.out.printf("%s%10s%10d%n", accounts[i].getAccountNum(), accounts[i].getName(),
							accounts[i].getBalance());
				}
				break;
			}

			case 3: {
				System.out.println("===============================");
				System.out.println("예금");
				System.out.println("===============================");

				System.out.print("계좌번호 : ");
				String a = sc.next();

				System.out.print("예금액 : ");
				int b = sc.nextInt();

				for (int i = 0; i < index; i++) {
					Account cur = accounts[i];
					if (cur.getAccountNum().equals(a)) {
						int plus = cur.getBalance() + b;
						cur.setBalance(plus);
						break;
					}
				}
				break;
			}
			case 4: {
				System.out.println("===============================");
				System.out.println("출금");
				System.out.println("===============================");

				System.out.print("계좌번호 : ");
				String a = sc.next();

				System.out.print("출급액 : ");
				int b = sc.nextInt();

				for (int i = 0; i < index; i++) {
					Account cur = accounts[i];
					if (cur.getAccountNum().equals(a)) {
						int minus = cur.getBalance() - b;
						cur.setBalance(minus);
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
