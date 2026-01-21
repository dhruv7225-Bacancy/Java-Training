package Arrays_Task;

import java.util.Scanner;
// Question 5: Loop Logic
// Write a program to:
// Print numbers from 1 to 50
// Skip numbers divisible by 5 (use loop logic)
public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(n<5){
            System.out.println("Enter the last number to print (eg 40,50 etc) : ");
            n=sc.nextInt();
            if(n<10){
                System.out.println("minimun value should be 10");
            }
        }
        for(int i=1;i<=n;i++){
            if(i%5==0)continue;
            System.out.print(i+" ");
        }
    }
}
