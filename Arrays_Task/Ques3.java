package Arrays_Task;

import java.util.Scanner;
// Question 3: Even & Odd Count
// Write a program to:
// Store numbers in an array
// Count how many numbers are even and odd
public class Ques3 {
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
            if(x%2==0){
                System.out.println(x+ " is even");
            }
            else {
                System.out.println(x+" is odd");
            }
        }
        
        sc.close();

    }
}
