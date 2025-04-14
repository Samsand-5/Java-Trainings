package abstraction_case_study;

public abstract class Payment {
	private String transactionId;
	private double amount;
	
	public Payment(String transactionId,double amount) {
		this.transactionId=transactionId;
		this.amount=amount;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	public double getAmount() {
		return amount;
	}
	
	public abstract void processpayment();
}
