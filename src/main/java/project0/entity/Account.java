package project0.entity;

public class Account {

	private int id;
	private double balance;

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}

}
