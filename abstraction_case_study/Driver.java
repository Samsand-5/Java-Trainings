package abstraction_case_study;

public class Driver {
	public static void main(String[] args) {
		Payment credit = new CreditCard("TNX007SBI", 700);
		credit.processpayment();
		System.out.println("------------------------------------------------");
		Payment paypal = new PayPal("TNX006ICICI", 900);
		paypal.processpayment();
	}
}
