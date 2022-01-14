package mystudy;


class Account{
	private String owner;
	private long balance;
	
	public Account() {};
	public Account(String owner) {
		this.owner=owner;
	}
	public Account(String owner, long balance) {
		this.owner=owner;
		this.balance=balance;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long deposit(long amount) {
		return balance=balance+amount;
	}
	public long withdraw(long amount) {
		if(amount<=balance) {
		return balance=balance-amount;
		}
		System.out.println("금액이 부족합니다.");
		return 0;
	}
	
}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("홍길동",50000);
		a.deposit(10000);
		a.withdraw(500000);
		System.out.println(a.getBalance());

	}

}
