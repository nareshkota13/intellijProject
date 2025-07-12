package com.automation;

public class naresh {
   static    int a= 10;
    static int b = 20;
    static int c = a + b;
    public static void main(String[] args) {

        //naresh obj = new naresh(); // Create an instance of the class
        System.out.println("Hello Naresh! Welcome to the Java Programming World.");
        System.out.println("The sum of " + a + " and " + b + " is: " + c);
        displayMessage(); // Call the static method
        greetCustomer("Naresh"); // Call the static method with a parameter
    }

    public static  void displayMessage() {
        System.out.println("This is a static method in the naresh class.");

    }

    public static void greetCustomer(String name) {
        System.out.println("Hello, " + name + "! Welcome to the application.");

    }
}
