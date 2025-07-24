package day3_programs;

public class BankAccMain {

	public static void main(String[] args) {
		BankAccount b= new BankAccount("om", 1000);
		b.deposit(2000);
		b.withdraw(500);
		b.displayDetails();

	}

}
