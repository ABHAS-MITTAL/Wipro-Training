package day10_programs;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionCom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<Integer> c1= new Comparator<Integer>(){
			public int compare(Integer i, Integer j) {
				if(i>j) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(11);
		a1.add(9);
		a1.add(27);
		a1.add(19);
		a1.add(8);
		System.out.println(a1);
		
		Collections.sort(a1,c1);
		System.out.println("After Sorting : "+a1);
		
		
	}

}

