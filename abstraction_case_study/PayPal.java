package abstraction_case_study;

public class PayPal extends Payment{

	public PayPal(String transactionId, double amount) {
		super(transactionId, amount);
		
	}

	@Override
	public void processpayment() {
		System.out.println("Processing PayPal Payment...");
        System.out.println("Transaction ID: " + getTransactionId());

        double discount = getAmount() > 500 ? getAmount() * 0.10 : 0; // 10% discount if amount > 500
        double transactionFee = (getAmount() - discount) * 0.03; // 3% transaction fee
        double finalAmount = (getAmount() - discount) + transactionFee;

        System.out.println("Original Amount: $" + getAmount());
        System.out.println("Discount Applied: $" + discount);
        System.out.println("Transaction Fee: $" + transactionFee);
        System.out.println("Final Payable Amount: $" + finalAmount);
        System.out.println("PayPal Payment Successful!");
	}
	
}
