package String.Problem1;

public class String1 {
//     Problem Statement
// Demonstrate how String immutability and String Constant Pool work in Java.
// Requirements
// Create multiple String objects using:
// String literals
// new String() keyword
// Compare Strings using:
// ==
// equals()
// Modify a String using concatenation
// Expected Implementation Focus
// Show that:
// Literal Strings share memory via SCP
// new String() creates a separate object
// String modification creates a new object
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        System.out.println("both s1 and s2 will point to same reference so s1==s2 :");
        System.out.println(s1==s2);
        System.out.println("Literal Strings share memory via SCP");

        String obj=new String("java");

        System.out.println("s2==obj :");
        System.out.println(s2==obj);
        System.out.println("s2.equals(obj) :");
        System.out.println(s2.equals(obj));
        System.out.println("new String() creates a separate object");

        String s3=s1.concat(s2);
        System.out.println("s1.concat(s2) :");
        System.out.println(s3);


    }
}
