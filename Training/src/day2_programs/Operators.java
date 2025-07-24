package day2_programs;

public class Operators {

	public static void main(String[] args) {
		        int a = 10, b = 5;

		        // 1. Arithmetic Operators
		        System.out.println("=== Arithmetic Operators ===");
		        System.out.println("a + b = " + (a + b)); // Addition
		        System.out.println("a - b = " + (a - b)); // Subtraction
		        System.out.println("a * b = " + (a * b)); // Multiplication
		        System.out.println("a / b = " + (a / b)); // Division
		        System.out.println("a % b = " + (a % b)); // Modulus

		        // 2. Relational Operators
		        System.out.println("\n=== Relational Operators ===");
		        System.out.println("a == b: " + (a == b)); // Equal to
		        System.out.println("a != b: " + (a != b)); // Not equal to
		        System.out.println("a > b: " + (a > b));   // Greater than
		        System.out.println("a < b: " + (a < b));   // Less than
		        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
		        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

		        // 3. Logical Operators
		        boolean x = true, y = false;
		        System.out.println("\n=== Logical Operators ===");
		        System.out.println("x && y: " + (x && y)); // Logical AND
		        System.out.println("x || y: " + (x || y)); // Logical OR
		        System.out.println("!x: " + (!x));         // Logical NOT

		        // 4. Assignment Operators
		        System.out.println("\n=== Assignment Operators ===");
		        int c = a; // Assignment
		        System.out.println("c = " + c);
		        c += b; // c = c + b
		        System.out.println("c += b => " + c);
		        c -= b; // c = c - b
		        System.out.println("c -= b => " + c);
		        c *= b; // c = c * b
		        System.out.println("c *= b => " + c);
		        c /= b; // c = c / b
		        System.out.println("c /= b => " + c);
		        c %= b; // c = c % b
		        System.out.println("c %= b => " + c);

		        // 5. Unary Operators
		        System.out.println("\n=== Unary Operators ===");
		        int d = 5;
		        System.out.println("d = " + d);
		        System.out.println("++d = " + (++d)); // Pre-increment
		        System.out.println("d++ = " + (d++)); // Post-increment
		        System.out.println("Now d = " + d);
		        System.out.println("--d = " + (--d)); // Pre-decrement
		        System.out.println("d-- = " + (d--)); // Post-decrement
		        System.out.println("Now d = " + d);
		        System.out.println("-d = " + (-d));   // Unary minus
		        System.out.println("+d = " + (+d));   // Unary plus

		        // 6. Bitwise Operators
		        System.out.println("\n=== Bitwise Operators ===");
		        int m = 6, n = 3; // 6 = 110, 3 = 011
		        System.out.println("m & n = " + (m & n)); // Bitwise AND
		        System.out.println("m | n = " + (m | n)); // Bitwise OR
		        System.out.println("m ^ n = " + (m ^ n)); // Bitwise XOR
		        System.out.println("~m = " + (~m));       // Bitwise NOT

		        // 7. Ternary Operator
		        System.out.println("\n=== Ternary Operator ===");
		        int max = (a > b) ? a : b;
		        System.out.println("Max of a and b: " + max);

		        // 8. Shift Operators
		        System.out.println("\n=== Shift Operators ===");
		        int num = 8; // binary: 1000
		        System.out.println("num << 1 = " + (num << 1)); // Left shift (multiply by 2)
		        System.out.println("num >> 1 = " + (num >> 1)); // Right shift (divide by 2)
		        System.out.println("num >>> 1 = " + (num >>> 1)); // Unsigned right shift


	}

}
