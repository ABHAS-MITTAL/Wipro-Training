package day5_programs;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ReminderTimer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Reminder");
        System.out.print("Enter your reminder message: ");
        String message = sc.nextLine();

        System.out.print("Enter time in seconds: ");
        int seconds = sc.nextInt();

        System.out.println(" Timer set for " + seconds + " seconds...\n");

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() 
            {
                System.out.println("Reminder: " + message);
                System.out.println("TIME'S UP!");
                timer.cancel();
            }
        }, seconds * 1000);

        sc.close();
    }
}
