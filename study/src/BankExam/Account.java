package BankExam;

public class Account {
	
	private String name;	//예금주
	private long balance;	//통장 잔액
	
	public Account() {
		
	}
	
	public Account(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}
	
	public void deposit(long amount) {		//입금
		balance += amount;
	}
	
	public void withdraw(long amount) {		//출금
		if(balance<amount) {
			System.out.println("잔고가 비참해 진행이 불가합니다.");
		}else {
			balance -= amount;
		};
	}

}
