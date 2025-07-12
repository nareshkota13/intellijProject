package org.example;



public class OperatorsExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        int c = 6, d = 3; // Binary: c = 110, d = 011
        System.out.println("\nBitwise Operators:");
        System.out.println("c & d: " + (c & d)); // AND
        System.out.println("c | d: " + (c | d)); // OR
        System.out.println("c ^ d: " + (c ^ d)); // XOR
        System.out.println("~c: " + (~c));       // Complement
        System.out.println("c << 1: " + (c << 1)); // Left shift
        System.out.println("c >> 1: " + (c >> 1)); // Right shift

        // Assignment Operators
        int e = 10;
        System.out.println("\nAssignment Operators:");
        e += 5; // e = e + 5
        System.out.println("e += 5: " + e);
        e -= 3; // e = e - 3
        System.out.println("e -= 3: " + e);
        e *= 2; // e = e * 2
        System.out.println("e *= 2: " + e);
        e /= 4; // e = e / 4
        System.out.println("e /= 4: " + e);
        e %= 3; // e = e % 3
        System.out.println("e %= 3: " + e);

        // Unary Operators
        int f = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("f: " + f);
        System.out.println("++f: " + (++f)); // Pre-increment
        System.out.println("f++: " + (f++)); // Post-increment
        System.out.println("--f: " + (--f)); // Pre-decrement
        System.out.println("f--: " + (f--)); // Post-decrement
    }
}