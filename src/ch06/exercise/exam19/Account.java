package ch06.exercise.exam19;

public class Account {

	// 필드 선언
	int balance; // 생성자에서 초기화해줘야함

	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;

	public void setBalance(int balance) {
		if (balance < 0) {
			return;
		} else if (balance > 1000000) {
			return;
		} else {
			this.balance += balance;
		}
	}
	
	
	public int getBalance() {
		return balance;
	}
}
