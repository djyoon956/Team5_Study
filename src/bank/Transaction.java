package bank;

import java.util.Calendar;

public class Transaction {
	String transactionDate;
	String transactionTime;
	String kind;
	long amount;
	long balance;
	
	public Transaction(String kind, long amount, long balance) {
		Calendar date=Calendar.getInstance();
		this.kind=kind;
		this.amount=amount;
		this.balance=balance;
		this.transactionDate=date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH)
		+ "월 " + date.get(Calendar.DATE)+"일";
		this.transactionTime=date.get(Calendar.HOUR) + "시" + date.get(Calendar.MINUTE)
		+ "분 " + date.get(Calendar.SECOND)+"초";
	}

	@Override
	public String toString() {
		return "*거래일자: " + transactionDate + transactionTime + "*\t*" + kind + ": " + amount+"원*\t*남은금액: " + balance+"*" ;
	}
	
	
	
}
