package day10_programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number: ");
		
		InputStreamReader i= new InputStreamReader(System.in);
		
		BufferedReader br= new BufferedReader(i);
		
		int a= Integer.parseInt(br.readLine());
		
		System.out.println("You entered: " + a);
		br.close();
		i.close();
		
	

	}

}
