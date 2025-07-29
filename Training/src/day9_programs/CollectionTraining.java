package day9_programs;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c1 = new ArrayList<Integer>();
		
		c1.add(10);
		c1.add(11);
		c1.add(12);
		c1.add(13);
		//c1.add("50");
		
		for(Object i:c1) {
			int a=(Integer) i;
			System.out.println(a);
		}


	}

}
