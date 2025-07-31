package day11_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaBinarySearch {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Integer> a =new ArrayList<>(Arrays.asList(20,30,25,50));
			a.add(12);
			a.add(45);
			System.out.println(a);
			Collections.sort(a);
			System.out.println("sorted:"+a);
			int  b =Collections.binarySearch(a,25);
			System.out.println("Index of 5000 in sorted list: "+b);
			Collections.reverse(a);
			System.out.println(a);
			
		}


}
