package day5_programs;

interface Wipro1
{
	 void system1();
	 void system2();
}

class Desktop1 implements Wipro1{

	public void system1() {
		System.out.println("Desktop is Added to Computer System");
	}

	public void system2() {
		System.out.println("Using Interface Wipro in Desktop");
	}
	
	
}

class Software2 implements Wipro1{

	public void system1() {
		// TODO Auto-generated method stub
		System.out.println("Using Interface Wipro in Software");
		
	}
	public void system2() {
		// TODO Auto-generated method stub
		System.out.println("Software is Added to Computer System");
		
	}
	
}
public class ComputerSystem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wipro1 w = new Desktop1();
		w.system1();
		w.system2();
		Wipro1 ww= new Software2();
		ww.system1();
		ww.system2();

	}

}
