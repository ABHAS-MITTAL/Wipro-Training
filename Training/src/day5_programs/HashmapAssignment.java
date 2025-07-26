package day5_programs;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapAssignment {

	public static void main(String[] args) {
		HashMap<String, Integer> ss = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("CHOICES: ");
			System.out.println("1. Add Student : ");
			System.out.println("2. Student Score : ");
			System.out.println("3. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice){
			case 1:
				System.out.println("Enter Student name: ");
				String StudentName = sc.nextLine();
				System.out.println("Enter Student Score :");
				int StudentScore = sc.nextInt();
				ss.put(StudentName, StudentScore);
				break;
			case 2:
				System.out.println("Enter the Student's Name whose score you want to get: ");
				String StudentName2 = sc.nextLine();
				Integer StudentScore2 = ss.get(StudentName2);
				
				if(StudentScore2 != null){
					System.out.println("Student Name : " + StudentName2 +" Student score: "+ StudentScore2);
				}
				else
				{
					System.out.println("Student not found");
				}
				break;
			case 3:
				System.out.println("Portal Ended..");
				sc.close();
				System.exit(0);
				break;
			default :
				System.out.println("invalid choice");
				break;	
			}
		}

	}

}
