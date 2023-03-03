package ch06.exercise.exam20;

import java.util.Scanner;

public class BankApplication_me {

	public static void main(String[] args) {

		Account ac[] = new Account[100];
		Scanner sc = new Scanner(System.in);

		int index = 0;
		while (true) {
			System.out.println("=================================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("=================================================");

			System.out.print("선택>");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				if (index > 100) {
					System.out.println("계좌를 추가할 수 없습니다. ");
				}
				System.out.println("=================");
				System.out.println("계좌생성");
				System.out.println("=================");

				System.out.print("계좌번호 : ");
				String str1 = sc.nextLine();

				System.out.print("계좌주 :");
				String str2 = sc.nextLine();

				System.out.print("초기입금액 :");
				int num1 = sc.nextInt();
				sc.nextLine();

				ac[index] = new Account(str1, str2, num1);
				System.out.println(" 결과 : 계좌가 생성되었습니다. ");
				index++;
				break;
			}
			case 2: {
				System.out.println("=================");
				System.out.println("계좌목록");
				System.out.println("=================");

				for (int i = 0; i < index; i++) {
					System.out.println(ac[i].accountNum + "   " + ac[i].name + "   " + "   " + ac[i].balance);
				}
				break;
			}
			case 3: {
				System.out.println("=================");
				System.out.println("예    금");
				System.out.println("=================");

				System.out.print("계좌번호 : ");
				String a = sc.nextLine();

				System.out.print("예금액 : ");
				int b = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < index; i++) {
					if (a.equals(ac[i].accountNum)) {
						ac[i].balance += b;
						break;
					}
				}
				break;
			}
			case 4: {
				System.out.println("=================");
				System.out.println("출    금");
				System.out.println("=================");

				System.out.print("계좌번호 : ");
				String a = sc.nextLine();

				System.out.print("출금액 : ");
				int b = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < index; i++) {
					if (a.equals(ac[i].accountNum)) {
						ac[i].balance -= b;
						break;
					}
				}
				break;
			}
			case 5: {
				System.out.println("시스템 종료");
				return;
			}
			}
		}

	}
}
