package exercise.stringInterviews;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        System.out.println("The FizzBuzz numberswill be: ");

        for(int i=1;i<=n;i++)
        {
            if(i%3==0&&i%5==0){
                System.out.println("FIZZBUZZ");

            }else if(i%3==0){
            System.out.println("FIZZ");
        }else if(i%5==0){
                System.out.println("BUZZ");
            }else{
                System.out.println("NULL");
            }

        }
        s.close();
    }
}
