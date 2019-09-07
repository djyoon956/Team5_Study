package bank;

public class BankMain {

	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.addAccount("123", "형남");
		System.out.println(bank.getAccount("123"));
		bank.getAccount("123").deposit(1000);
		bank.getAccount("123").deposit(1000);
		bank.getAccount("123").deposit(1000);
		
		for (Account account : bank.accounts) {
			for ( Transaction transaction : account.transactions) {
				System.out.println(transaction.toString());
			}
		}
	}

}
