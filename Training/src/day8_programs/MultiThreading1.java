package day8_programs;

class Mul1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("This is Thread 1");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e){
			e.printStackTrace();
		}
		}
	}
}
class Mul2 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("This is Thread 2");
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading1 {
public static void main(String[] args) {
	Mul1 m1=new Mul1();
	Mul2 m2=new Mul2();
	//System.out.println(m2.getPriority());
	//m2.setPriority(Thread.MAX_PRIORITY);
	m1.start();
	try {
		Thread.sleep(5);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
		
	}
	m2.start();
	
}
}

