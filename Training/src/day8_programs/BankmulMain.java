package day8_programs;

public class BankmulMain {
	public static void main(String[] args) throws InterruptedException {

		Bank_mul bank = new Bank_mul(1000);

		Thread t1 = new Thread(() -> {
			for (int i = 1; i < 3; i++) {
				bank.deposit(500);
				sleep(100);
			}
		}, "Deposited-Thread");

		Thread t2 = new Thread(() -> {
			for (int i = 1; i < 3; i++) {
				bank.withdraw(200);
				sleep(100);
			}
		}, "Withdraw Thread");
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.printf("get balance: %.2f", bank.getBalance());
	}

	private static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}