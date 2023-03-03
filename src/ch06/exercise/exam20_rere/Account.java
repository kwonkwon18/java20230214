package ch06.exercise.exam20_rere;

public class Account {

	String accountNum;
	String name;
	int balance = 0;

	Account(String accountNum, String name, int balance) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
}
