// Java Type Conversion & Type Casting Example
// Demonstrates implicit type conversion (widening) and explicit type casting (narrowing)

public class TypeConversion {
    public static void main(String[] args) {
        
        // ----------------- 1. Type Conversion (Widening) -----------------
        // Definition: Automatic conversion of smaller data type to a larger data type
        // No data loss occurs in widening conversion
        byte b = 10;        // byte (1 byte)
        short s = b;        // byte -> short (2 bytes)
        int i = s;          // short -> int (4 bytes)
        long l = i;         // int -> long (8 bytes)
        float f = l;        // long -> float (4 bytes)
        double d = f;       // float -> double (8 bytes)
        
        System.out.println("Type Conversion (Widening):");
        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        
        // ----------------- 2. Type Casting (Narrowing) -----------------
        // Definition: Manual conversion of larger data type to smaller data type
        // May cause data loss or overflow
        double d1 = 123.456;         
        float f1 = (float) d1;       // double -> float
        long l1 = (long) f1;         // float -> long
        int i1 = (int) l1;           // long -> int
        short s1 = (short) i1;       // int -> short
        byte b1 = (byte) s1;         // short -> byte
        
        System.out.println("\nType Casting (Narrowing):");
        System.out.println("double d1 = " + d1);
        System.out.println("float f1 = " + f1);
        System.out.println("long l1 = " + l1);
        System.out.println("int i1 = " + i1);
        System.out.println("short s1 = " + s1);
        System.out.println("byte b1 = " + b1);
        
        // ----------------- 3. Char Conversion -----------------
        // char can be converted to int (ASCII/Unicode value) and vice versa
        char ch = 'A';           // char (2 bytes)
        int chToInt = ch;        // char -> int (implicit)
        char intToChar = (char) 66; // int -> char (explicit)
        
        System.out.println("\nChar Conversion:");
        System.out.println("char ch = " + ch);
        System.out.println("char to int: " + chToInt);
        System.out.println("int 66 to char: " + intToChar);
        
        // ----------------- 4. Example: Data Loss -----------------
        // Narrowing conversion can cause overflow or data loss
        double d2 = 130.99;
        byte b2 = (byte) d2;  // double -> byte (overflow)
        
        System.out.println("\nData Loss Example:");
        System.out.println("double d2 = " + d2);
        System.out.println("byte b2 = " + b2);  // overflow occurs
    }
}
