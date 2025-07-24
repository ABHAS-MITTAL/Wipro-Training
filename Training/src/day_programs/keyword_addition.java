package day_programs;
import java.util.Scanner;

public class keyword_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a= sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b= sc.nextInt();
		
		int sum=a+b;
		System.out.println("Sum of Two numbers:"+ sum);
		sc.close();
	}

}
