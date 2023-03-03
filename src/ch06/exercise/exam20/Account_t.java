package ch06.exercise.exam20;

public class Account_t {
	private String number;
	private String name;
	private int money;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if (money < 0) {
			System.out.println("다시 입력해주세요");
			return;
		} else {
			this.money = money;
		}
	}

}
