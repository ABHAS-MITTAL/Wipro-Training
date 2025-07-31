package day11_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaCollectionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> courses = new ArrayList<>();
		
		courses.add("Java");
		courses.add("Python");
		courses.add("Flutter");
		
		for(String s:courses) {
			System.out.println(s);
		}
		
		Set<Integer> setcourses =new HashSet<>();
		
		setcourses.add(10);
		setcourses.add(7);
		setcourses.add(2);
		setcourses.add(22);
		
		for(Integer s:setcourses) {
			System.out.println(s);
		}
		
		Map<String, Integer> Mapcourses = new HashMap<String, Integer>();
		
		Mapcourses.put("Data Science", 103);
		Mapcourses.put("Cyber security", 101);
		Mapcourses.put("System Analysis", 102);
		
		for(String s1:Mapcourses.keySet()) {
			System.out.println(s1+"="+Mapcourses.get(s1));
		}

	}

}
