package String.Problem3;

import java.util.Scanner;

// Practical Question 3 (String Operations – Mandatory)Problem Statement
// Create a utility program to perform common String operations using both String and StringBuilder.
// Requirements
// Take a sample input String
// Perform the following operations:
// Reverse the string
// Extract a substring from given indexes
// Check if a word exists using contains()
// Implement:
// Reversal using StringBuilder
// Substring and search using String
public class String1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String with length greater then 5 :");
        String s=sc.nextLine();

        StringBuilder sb=new StringBuilder(s);
        System.out.println("reverse of string is : "+ sb.reverse());

        System.out.println("substring from 2 to 5 index in string "+s +" is : "+s.substring(2,5));
        if(s.contains("hello")){
            System.out.println("string "+s +" contains hello");
        }
        else{
            System.out.println("string "+s +"not contains hello");
        }
    }
}
