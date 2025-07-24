package day3_programs;

public class Calculator {
	
	class Calculator1{
		public int add(int a, int b) {
			return a+b;
		}
		public double add(double a,double b) {
			return a+b;
		}
	}
	
	public static void main(String[] args) {
		Calculator c= new Calculator();
		Calculator1 c1= c.new Calculator1();
		System.out.println("in integers : "+c1.add(10, 20));
		System.out.println("in doubles : "+c1.add(10.1, 20.2));
	}

}
