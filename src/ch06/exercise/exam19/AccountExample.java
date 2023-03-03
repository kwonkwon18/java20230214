package ch06.exercise.exam19;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();

		account.setBalance(10000);
		System.out.println("현재잔고 : " + account.getBalance()); // 현재잔고 : 10000

		account.setBalance(-100);
		System.out.println("현재잔고 : " + account.getBalance()); // 현재잔고 : 10000

	}

}
