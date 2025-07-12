package com.automation;

public class stringTestJava {

    public static void main(String[] args) {

        //Write a program to count the number of characters in a string
// Write a program to count the number of words in a string
        //Write a java program to count number of occurrences of a given char in a string
        //write a program to reverse a string
        //write a program to remove spaces starting and ending of a string
        //write a java program to each word of a given string
        String s = "   Learning   Java is fun!";
        //System.out.println(s.length());
        // System.out.println("Number of words: " + countWords(S));
        //write a program to reverse a string
        System.out.println("String in reverse: " + reverseString(s));
        //write a program to remove spaces from a string
       // s=s.replaceAll("\\s", "");
        System.out.println("String after removing spaces: " + s.replaceAll("\\s", ""));
        //System.out.println("Reverse each word in a string: " + );


    }

    private static String reverseEachWord(String s) {
        return s;
    }


    private static String reverseString(String S) {
        return new StringBuilder(S).reverse().toString();
    }
    }
