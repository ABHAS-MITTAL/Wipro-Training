package day9_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionCom implements Comparable<CollectionCom>{

	private String name;
	private int age;
	public CollectionCom(String n, int a) {
		this.name=n;
		this.age=a;
	}
	public int compareTo(CollectionCom other) {
		return this.age-other.age;
		
	}
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		List<CollectionCom> a = Arrays.asList(new CollectionCom("Sumit",24),
				new CollectionCom("Naman",25));
		Collections.sort(a);
		System.out.println(a);
	}
}



