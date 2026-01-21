package Arrays_Task;

import java.util.Scanner;
// Question 2: Find Maximum & Minimum
// Write a program to:
// Store numbers in an array
// Find the maximum and minimum values using loops
public class Ques2 {
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
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int x: arr){
            max=Math.max(max,x);
            min=Math.min(min,x);
        }
        System.out.println("Minimum value is: "+min);
        System.out.println("Maximum value is: "+max);
        sc.close();

    }
}
