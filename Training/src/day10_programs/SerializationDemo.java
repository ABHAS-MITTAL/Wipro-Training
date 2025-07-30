package day10_programs;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student999{
	private String name;
	private int age;
	public Student999(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class SerializationDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student999 s1=new Student999("Abhas",24);
		
		/*FileOutputStream out = new FileOutputStream("C:/Users/abhas/OneDrive/Desktop/hello.txt");
		ObjectOutputStream output = new ObjectOutputStream(out);
		output.writeObject(s1);
		out.close();
		output.close();
		
		FileInputStream i= new FileInputStream("C:/Users/abhas/OneDrive/Desktop/hello.txt");
		ObjectInputStream input = new ObjectInputStream(i);
		Student999 s2=(Student999)input.readObject();
		
		// Serialization
		FileOutputStream out = new FileOutputStream("C:/Users/abhas/OneDrive/Desktop/hello.txt");
		ObjectOutputStream output = new ObjectOutputStream(out);
		output.writeObject(s1);
		output.close();
		out.close();

		// Deserialization
		FileInputStream i = new FileInputStream("C:/Users/abhas/OneDrive/Desktop/hello.txt");
		ObjectInputStream input = new ObjectInputStream(i);
		Student999 s2 = (Student999) input.readObject();
		input.close();
		i.close();

		// Display deserialized data
		System.out.println("Deserialized Student:");
		System.out.println("Name: " + s2.getName());
		System.out.println("Age: " + s2.getAge());*/
		
}
}
