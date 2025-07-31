package day11_programs;

import java.util.ArrayList;
import java.util.Collections;

public class JavaCollectionExample {
	
	class department{
		private String name;
		private double sales;
		private double expenses;
		public department(String name, double sales, double expenses) {
			this.name = name;
			this.sales = sales;
			this.expenses = expenses;
		}
		
		public double getprofit() {
			return sales-expenses;
		}
		public String getName()
		{
			return name;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<department> depart = new ArrayList<>();
		
		depart.add(new JavaCollectionExample().new department("Sumit", 110, 90));
		depart.add(new JavaCollectionExample().new department("Mohan", 100, 95));
		depart.add(new JavaCollectionExample().new department("Raghav", 120, 80));
		
		
		for(department d:depart) {
			System.out.println("Name: "+d.getName()+"Profit: "+d.getprofit());
		}
		
		depart.sort((d1,d2) -> Double.compare(d2.getprofit(), d2.getprofit()));
		System.out.println("Sorting done successfullly..");
		
		for(department d:depart) {
			System.out.println("Name: "+d.getName()+"Profit: "+d.getprofit());
		}
	}

}
