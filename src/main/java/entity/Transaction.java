package project0.entity;

public class Transaction {

	private int id;
	private double amount;
//	private LocalDateTime dateTime;
	private String debAccID;
	private String creAccID;
	

	public Transaction(double amount) {
		super();
		this.amount = amount;
	}

	public Transaction() {
		// TODO Auto-generated constructor stub
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

	public String getDebAccID() {
		return debAccID;
	}

	public void setDebAccID(String debAccID) {
		this.debAccID = debAccID;
	}

	public String getCreAccID() {
		return creAccID;
	}

	public void setCreAccID(String creAccID) {
		this.creAccID = creAccID;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + "     amount=" + amount + "     debAccID=" + debAccID + "     creAccID=" + creAccID
				+ "]";
	}

	

}
