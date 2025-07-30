package day10_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int age;
	String name;
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

}
public class Comparator_String1 {
	public static void main(String args[]) {
		
		Comparator<Student> com = new Comparator<Student>() {
			public int compare(Student i , Student j) {
				if(i.age>j.age) {
					return 1;
				}else {
					return -1;
				}
			}

		};
		
		List<Student> stud = new ArrayList<>();
		
		stud.add(new Student(12,"Kartik"));
		stud.add(new Student(11,"Rohan"));
		stud.add(new Student(13,"Suman"));
		stud.add(new Student(10,"Meghna"));
		Collections.sort(stud, com);;
		
		for(Student s:stud) {
			System.out.println(s);
		}
	}
}