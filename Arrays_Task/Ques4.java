package Arrays_Task;
// Question 4: Sum & Average
// Write a program to:
// Store marks of students in an array
// Calculate the sum and average using loops

import java.util.Scanner;

public class Ques4 {
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
        long sum=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter number : ");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        float avg=sum/(float)n;
        System.out.println("average of given values is : "+avg);
        sc.close();
    }
}
