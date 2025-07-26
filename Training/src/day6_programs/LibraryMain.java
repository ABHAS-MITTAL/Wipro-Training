package day6_programs;

interface interface1 {
	default void msg() {
		System.out.println("using inteface 1");
	}

}
interface interface2 {

	default void msg() {
		System.out.println("using interface 2");
	}
}

class LibInfo implements interface1,interface2{

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		interface1.super.msg();
		interface2.super.msg();
	}
}


public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibInfo l1 = new LibInfo();
		l1.msg();
	}

}
