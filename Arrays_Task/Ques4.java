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
        while(n<=0){
            System.out.println("Enter number of students: ");
            n=sc.nextInt();
            if(n<0){
                System.out.println("number of students can't be negative");
            }
            else if(n==0){
                System.out.println("number of students can't be zero");
            }
        }

        int arr[][]=new int[n][5];
        
        System.out.println("Enter the marks of each student : ");
        for(int i=0;i<n;i++){
            System.out.print("Enter marks for student ");
            System.out.println(i+1);
            for(int j=0;j<5;j++){
                System.out.print("enter marks for subject ");
                System.out.print(j+1);
                System.out.print(" : ");
                arr[i][j]=sc.nextInt();
            }
            System.out.println("\n");
        }
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=0;j<5;j++){
                sum+=arr[i][j];
            }
            float avg=sum/(float)n;
            int sid=i+1;
            System.out.println("average marks of student "+sid+" is : "+avg);
        }
        sc.close();
    }
}
