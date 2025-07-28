package day7_programs;

import java.io.File;
import java.io.IOException;

public class CreatingNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File myfile= new File("MyFirstFile.txt");
		if(myfile.createNewFile()) {
			System.out.println("File Created : "+ myfile.getName());
		}
		else {
			System.out.println("File Already Exist");
		}
		}
		catch(IOException e) {
			System.out.println("An Error Occured");
			e.printStackTrace();	
		}
	}

}
