package bank;

import java.util.ArrayList;

public class Bank {
	ArrayList<Account> accounts;
	private int totalAccount;
	
	public Bank() {
		accounts=new ArrayList<Account>();
	}
	
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));
	}
	
	public Account getAccount(String accountNum) {
		for (Account account : accounts) {
			if(account.accountNum.equals(accountNum)) {
				return account;
			}
		}
		return null;
	}
	
	public ArrayList<Account> findAccounts(String name) {
		ArrayList<Account> nameList=new ArrayList<Account>();
		for (Account account : accounts) {
			if(account.name.equals(name)) {
				nameList.add(account);
				return nameList;
			}
		}
		return null;
	}
	
	public ArrayList<Account> getAccounts() {
		
		return accounts;
	}
	
	public int getTotalAccount() {
		
		return accounts.size();
	}
	
}
