package day4_programs;


interface Payment
{
	void makePayment();
}

abstract class PaymentSystem implements Payment 
{

	double amount;
	
	PaymentSystem(double amount)
	{
		this.amount = amount;
	}
	
	void showSuccessMessage() 
	{
		System.out.println("Payment Successful : "+ amount);
	}

}
class CardPayment extends PaymentSystem
{
	CardPayment(double amount)
	{
		super(amount);
	}

	public void makePayment() 
	{
		System.out.println("Card PAyment done..");
		showSuccessMessage();
	}
}
class rtgs extends PaymentSystem
{
	rtgs(double amount)
	{
		super(amount);
	}

	public void makePayment() 
	{
		System.out.println("rtgs done..");
		showSuccessMessage();
	}
	
}
public class PaymentSytem 
{
	public static void main(String[] args)
	{
		
		PaymentSystem ps = new CardPayment(34000);
		ps.makePayment();
		
		PaymentSystem ps1= new rtgs(5000);
		ps1.makePayment();
	}

}
