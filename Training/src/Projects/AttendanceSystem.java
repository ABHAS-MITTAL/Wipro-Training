package Projects;

import java.util.Scanner;


public class AttendanceSystem {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String[] student = new String[n];
        String[] attendance  = new String[n];
        
		for(int i=0; i<n; i++)
		{
            System.out.print("Student " + (i+1) + ": ");
			student[i] =sc.nextLine();
		}

		for (int i = 0; i < n; i++) {
            System.out.print("Is " + student[i] + " present:  Yes=Y & No=N: ");
            String input = sc.nextLine().toUpperCase();
            attendance[i] = input.equals("Y") ? "Present" : "Absent";
        }

       
        System.out.println("\nAttendance Report:");
        for (int i = 0; i < n; i++) {
            System.out.println(student[i] + ": " + attendance[i]);
        }
	
        System.out.println();
	}

}
