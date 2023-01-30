package exercise.stringInterviews;

import java.util.Scanner;

public class FizzBuzz2 {

    public static void main(String[]args){

        Scanner start = new Scanner(System.in);
        System.out.println("Enter Lower Limit:");
        int lower = start.nextInt();

        Scanner end = new Scanner(System.in);
        System.out.println("Enter Upper Limit:");
        int upper = end.nextInt();

        System.out.println("The FizzBuzz numbers will be:");

        for(int i=lower;i<=upper;i++)
        {
            if(i%3==0&&i%5==0){
                System.out.println("FIZZBUZZ");

            }else if(i%3==0){
            System.out.println("FIZZ");
        }else if(i%5==0){
                System.out.println("BUZZ");
            }else{
                System.out.println(i);
            }

        }
        start.close();
        end.close();

    }
}
