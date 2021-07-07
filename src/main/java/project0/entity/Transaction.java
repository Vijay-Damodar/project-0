package project0.entity;

public class Transaction {

	private int id;
	private double amount;
	private boolean creditdebit;
	private int fromAcc;
	private int toAcc;

	public Transaction(int id, double amount, boolean creditdebit, int fromAcc, int toAcc) {
		super();
		this.id = id;
		this.amount = amount;
		this.creditdebit = creditdebit;
		this.fromAcc = fromAcc;
		this.toAcc = toAcc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isCreditdebit() {
		return creditdebit;
	}

	public void setCreditdebit(boolean creditdebit) {
		this.creditdebit = creditdebit;
	}

	public int getFromAcc() {
		return fromAcc;
	}

	public void setFromAcc(int fromAcc) {
		this.fromAcc = fromAcc;
	}

	public int getToAcc() {
		return toAcc;
	}

	public void setToAcc(int toAcc) {
		this.toAcc = toAcc;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", creditdebit=" + creditdebit + ", fromAcc=" + fromAcc
				+ ", toAcc=" + toAcc + "]";
	}

}
