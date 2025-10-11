// This is a simple Java program that prints a message to the console.
// It demonstrates the minimal structure required for a runnable Java application:
// 1) a class declaration, and 2) a main method which is the program entry point.

// Every Java program must have at least one class. The filename should match
// the public class name (hello.java -> public class hello).
// The main method is the starting point for Java applications.
    // JVM looks for this exact method signature to begin execution:
    // public - accessible from outside the class
    // static - can be called without creating an instance of the class
    // void - does not return any value
    // String[] args - array of command-line arguments passed to the program
public class hello {
    public static void main(String[] a) {
        System.out.print("Hello, World!");
    }
}
// System.out.print prints the provided string without a newline
// to the standard output (console). Here it prints: Hello, World!