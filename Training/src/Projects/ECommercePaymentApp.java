package Projects;

import java.util.*;
interface PaymentMode{
	void pay(double amount);
}

class UpiPayment implements PaymentMode{
	private String payme;
	
	public UpiPayment(String payme) {
		this.payme = payme;
	}
	
	public void pay(double amount) {
		System.out.println("PAID VIA UPI : "+ amount+ " UPI ID : "+ payme);
	}
}

class CreditCardPayment implements PaymentMode{
	private String payme;
	
	public CreditCardPayment(String payme) {
		this.payme = payme;
	}
	
	public void pay(double amount) {
		System.out.println("PAID VIA CREDIT CARD : "+amount+"Credit Card NO. : "+payme);
	}
}

class CODPayment implements PaymentMode{
	public void pay(double amount) {
		System.out.println("WILL PAY VIA CASH ON DELIVERY : "+amount);
	}
}
public class ECommercePaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double orderamount=2000.0;
		
		System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Cash on Delivery");
        
        Scanner sc = new Scanner(System.in);
        int choice= sc.nextInt();   
        sc.nextLine();
        
        PaymentMode payment = null;

        switch(choice) {
        case 1:
        	System.out.println("Enter UPI ID : ");
        	String upiId= sc.nextLine();
        	payment = new UpiPayment(upiId);
        	break;
        case 2:
        	System.out.println("Enter Credit Card No. : ");
        	String cardNo= sc.nextLine();
        	payment = new CreditCardPayment(cardNo);
        	break;
        case 3:
        	payment = new CODPayment();
        	break;
        default:
        	System.out.println("INVALID CHOICE..");
        		
        }
        
        payment.pay(orderamount);
        System.out.println("Payment Processed . THANKS FOR SHOPPING..");
		/*
		PaymentMode p1;
		p1= new UpiPayment();
		p1.pay(450);
		
		p1=new CreditCardPayment();
		p1.pay(500);
		
		p1= new CODPayment();
		p1.pay(750);*/

	}

}
