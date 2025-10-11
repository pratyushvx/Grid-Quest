// Java Char Data Type Example
// Demonstrates initialization, printing, Unicode, and operations

public class CharOperation {
    public static void main(String[] a) {   
        // ----------------- 1. Initializing char -----------------
        char letter = 'A';            // Uppercase letter
        char smallLetter = 'z';       // Lowercase letter
        char digit = '7';             // Digit as character
        char symbol = '#';            // Special character
        char unicodeChar = '\u0041';  // Unicode for 'A'
        
        // ----------------- 2. Printing char -----------------
        System.out.println("Letter: " + letter);
        System.out.println("Small Letter: " + smallLetter);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);
        System.out.println("Unicode Char: " + unicodeChar);
        
        // ----------------- 3. Char in arithmetic operations -----------------
        char c1 = 'A';  // ASCII 65
        char c2 = 'a';  // ASCII 97
        
        int sum = c1 + c2;  // Adds ASCII values
        int difference = c2 - c1; // Subtracts ASCII values
        
        System.out.println("\nArithmetic with char:");
        System.out.println("Sum of '" + c1 + "' + '" + c2 + "' = " + sum);
        System.out.println("Difference of '" + c2 + "' - '" + c1 + "' = " + difference);
        
        // Incrementing char
        char nextLetter = 'A';
        nextLetter++; // Moves to next Unicode character
        System.out.println("Next character after 'A' is: " + nextLetter);
        
        // Comparing chars
        if(c1 < c2) {
            System.out.println(c1 + " comes before " + c2 + " in ASCII");
        }
        
        // Using char in String concatenation
        String message = "Hello " + letter + smallLetter + "!";
        System.out.println("Message: " + message);
        
        // ----------------- 4. Using Unicode -----------------
        char smiley = '\u263A'; // Unicode for ☺
        System.out.println("Unicode smiley: " + smiley);
    }
}
