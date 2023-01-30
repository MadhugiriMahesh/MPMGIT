package exercise.stringInterviews;

import java.util.Scanner;

public class FizzBuzz1 {

    public static void main(String[]args){

          int lower=1,upper=20;

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

    }
}
