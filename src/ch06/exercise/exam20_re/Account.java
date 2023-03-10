package ch06.exercise.exam20_re;

public class Account {

	private String accountNum;
	private String name;
	private int balance;

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	// 값에 음수가 들어가면 다시 입력하도록 함 
	public void setBalance(int balance) { 
		if (balance < 0) {
			System.out.println("값을 잘못 입력하셨습니다");
			return;
		} else {
			this.balance = balance;
		}
	}
	
	// 다른 setBalance를 둬서 출금 시 금액 부족이 일어나면 출금되지 않도록 함 
	public void setBalance2(int balance) { 
		if (balance < 0) {
			System.out.println("금액부족");
			return;
		} else {
			this.balance = balance;
		}
	}

}
