package day5_programs;

abstract class Wipro{
	abstract void system1();
	abstract void system2();
}

class Desktop extends Wipro{

	@Override
	void system1() {
		System.out.println("Desktop is Added to Computer System");
	}

	@Override
	void system2() {
		
	}
	
	
}

class Software extends Wipro{

	@Override
	void system1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void system2() {
		// TODO Auto-generated method stub
		System.out.println("Software is Added to Computer System");
		
	}
	
}
public class ComputerSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wipro w = new Desktop();
		w.system1();
		Wipro ww= new Software();
		ww.system2();

	}

}
