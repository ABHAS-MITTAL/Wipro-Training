package day9_programs;

public class WrapperTraining3 {
	public static void main(String args[]) {
		double d= 400.12;
		Double e=d;
		double f=e;
		System.out.println("Double NO. : "+f);
		
		String s1="123.45";
		Double d1=Double.parseDouble(s1);
		System.out.println("Double String to NO.: "+d1);
		
		float p= 40;
		Float q= p;
		float r= q;
		System.out.println("Float NO. :"+r);
		
		String s2="78";
		Float p1=Float.parseFloat(s2);
		System.out.println("String to Float NO. : "+p1);
		
		
	}
}
