package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	String accountNum;
	String name;
	private long balance;
	ArrayList<Transaction> transactions;
	Scanner sc;
	
	public Account(String accountNo, String name) { //생성자
		this.accountNum=accountNo;
		this.name=name;
		transactions=new ArrayList<Transaction>();
		sc=new Scanner(System.in);
	}
	public void deposit(long amount) { //입급
		this.balance+=amount;
		transactions.add(new Transaction("입금", amount, this.balance));
		System.out.println(amount+"원이 입금되었습니다.");
	}
	
	public void withdraw(long amount) { //출금
		if(this.balance<amount) {
			System.out.println("잔액이 부족합니다.");
		}
		else {
			this.balance-=amount;
			transactions.add(new Transaction("출금", amount, this.balance));
			System.out.println(amount+"원이 출금되었습니다.");
		}
	}
	
	public long getBalance() { //잔고확인
		return this.balance;
	}
	
	public ArrayList<Transaction> getTransaction() { //거래내역 확인
		return transactions;
	}
	
}
