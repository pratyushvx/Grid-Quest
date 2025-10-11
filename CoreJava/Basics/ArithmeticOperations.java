// Java Arithmetic Operations Example

public class ArithmeticOperations {
    public static void main(String[] args) {
        
        // ----------------- 1. Initializing variables -----------------
        int a = 10;
        int b = 3;
        
        // ----------------- 2. Basic Arithmetic -----------------
        int sum = a + b;           // Addition
        int difference = a - b;    // Subtraction
        int product = a * b;       // Multiplication
        int quotient = a / b;      // Division (integer division)
        int remainder = a % b;     // Modulus (remainder)
        
        System.out.println("Basic Arithmetic:");
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
        System.out.println(a + " % " + b + " = " + remainder);
        
        // ----------------- 3. Increment & Decrement -----------------
        int x = 5;
        int y = 5;
        
        System.out.println("\nIncrement & Decrement:");
        System.out.println("Original x = " + x);
        System.out.println("x++ = " + (x++)); // Post-increment
        System.out.println("After x++ x = " + x);
        System.out.println("++y = " + (++y)); // Pre-increment
        System.out.println("After ++y y = " + y);
        
        int p = 7;
        int q = 7;
        
        System.out.println("\nPost-decrement & Pre-decrement:");
        System.out.println("p-- = " + (p--)); // Post-decrement
        System.out.println("After p-- p = " + p);
        System.out.println("--q = " + (--q)); // Pre-decrement
        System.out.println("After --q q = " + q);
        
        // ----------------- 4. Floating point arithmetic -----------------
        double num1 = 12.5;
        double num2 = 3.5;
        System.out.println("\nFloating-point Operations:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
