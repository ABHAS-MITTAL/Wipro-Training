package day4_programs;
import java.util.*;
public class ArrayList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> fruits= new ArrayList<>();
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Chia");
		
		System.out.println(fruits);
		
		for(String i: fruits) {
			System.out.println(i);
		}
		Collections.sort(fruits);		
		System.out.println(fruits);
		
		ArrayList<Integer> jff=new ArrayList<Integer>();
	}

}
