// A literal is a fixed value directly written in the code.
// Literals are used to assign values to variables.

public class Literals {
    public static void main(String[] args) {
        
        // ----------------- Integer Literals -----------------
        int decimal = 100;         // Decimal literal
        int octal = 0144;          // Octal literal (starts with 0)
        int hex = 0x64;            // Hexadecimal literal (starts with 0x)
        int binary = 0b1100100;    // Binary literal (starts with 0b)
        
        // ----------------- Floating-Point Literals -----------------
        float f = 5.75f;           // float literal, add 'f'
        double d = 19.99;          // double literal (default for decimals)
        double scientific = 1.23e2; // Scientific notation (1.23 * 10^2)
        
        // ----------------- Character Literals -----------------
        char letter = 'A';         // Single character
        char digit = '7';          // Digit as character
        char symbol = '#';         // Special character
        char unicodeChar = '\u0041'; // Unicode literal for 'A'
        
        // ----------------- String Literals -----------------
        String name = "Pratyush";  
        String message = "Hello, Java!";
        
        // ----------------- Boolean Literals -----------------
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        
        // ----------------- Null Literal -----------------
        String str = null;  // Represents no object
        
    
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hex: " + hex);
        System.out.println("Binary: " + binary);
        
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Scientific: " + scientific);
        
        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);
        System.out.println("Unicode Char: " + unicodeChar);
        
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
        
        System.out.println("Java Fun? " + isJavaFun);
        System.out.println("Fish Tasty? " + isFishTasty);
        
        System.out.println("String is: " + str);
    }
}
