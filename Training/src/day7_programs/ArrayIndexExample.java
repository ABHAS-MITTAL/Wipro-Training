package day7_programs;

public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing 6th element: " + numbers[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Exception caught: " + e);
        }

        System.out.println("Program continues after handling exception.");
    }
}
