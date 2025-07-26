package day7_programs;

import java.util.Scanner;

public class FactorialWithCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        try {
            if (num < 0) {
                throw new IllegalArgumentException(" Error: Factorial is not defined for negative numbers!");
            }

            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }

            System.out.println(" Factorial of " + num + " is: " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

