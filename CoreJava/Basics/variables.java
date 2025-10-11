// A variable is a name given to a memory location that stores data.  
// Its value can change during program execution.

public class variables {
    public static void main(String[] args) {
        
        // ----------------- Primitive Data Types -----------------
        
        // byte: stores whole numbers from -128 to 127
        // Memory size: 1 byte, default value: 0
        byte b = 100;
        
        // short: stores whole numbers from -32,768 to 32,767
        // Memory size: 2 bytes, default value: 0
        short s = 10000;
        
        // int: stores whole numbers (most commonly used)
        // Memory size: 4 bytes, default value: 0
        int age = 25;
        
        // long: stores large whole numbers, add 'L' at the end
        // Memory size: 8 bytes, default value: 0L
        long population = 100000L;
        
        // float: stores decimal numbers, add 'f' at the end
        // Memory size: 4 bytes, default value: 0.0f
        float height = 5.9f;
        
        // double: stores decimal numbers, more precision than float
        // Memory size: 8 bytes, default value: 0.0
        double weight = 70.5;
        
        // char: stores a single character
        // Memory size: 2 bytes, default value: '\u0000'
        char grade = 'A';
        
        // boolean: stores true or false
        // Memory size: 1 bit, default value: false
        boolean isPassed = true;
        
        // ----------------- Non-Primitive Data Type -----------------
        
        // String: stores sequence of characters (text)
        // String is a class (non-primitive), default value: null
        String name = "Pratyush";
        
        // ----------------- Printing Variables -----------------
        
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + age);
        System.out.println("Long: " + population);
        System.out.println("Float: " + height);
        System.out.println("Double: " + weight);
        System.out.println("Char: " + grade);
        System.out.println("Boolean: " + isPassed);
        System.out.println("String: " + name);
    }
}
