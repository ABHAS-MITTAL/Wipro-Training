package day4_programs;

import java.util.Random;

public class RandomNumberAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long random10Numbers=TendigitNumber();
		System.out.println("Random 10 digit number : "+random10Numbers);
		
	}
	public static long TendigitNumber()
	{
		Random random=new Random();
		long min = 1000000000L;
		long max = 9999999999L;
		
		long random10Numbers = min+((long)(random.nextDouble()*(max-min+1)));
		//long random10Numbers = (long)(random.nextLong());
		return random10Numbers;
	}

}
