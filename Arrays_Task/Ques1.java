package Arrays_Task;

import java.util.Scanner;
// Question 1: Array Traversal
// Write a program to:
// Create an integer array with at least 5 values
// Print all elements using a loop
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(n<5){
            System.out.println("Enter the length of array : ");
            n=sc.nextInt();
            if(n<5){
                System.out.println("minimun length should be 5");
            }
        }

        int arr[]=new int[n];
        System.out.println("Enter the value of each number : ");
        for(int i=0;i<n;i++){
            System.out.println("Enter number : ");
            arr[i]=sc.nextInt();
        }

        for(int x: arr){
            System.out.print(x + " ");
        }
        sc.close();

    }
}
