package exercise.strings;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args){
       /* Scanner start=new Scanner(System.in);
        System.out.println("Enter the start no :");
        int lower=start.nextInt();*/

        Scanner end=new Scanner(System.in);
        System.out.println("Enter the Last no :");
        int upper=end.nextInt();

        for(int i= 1; i<=upper; i++)
        {
            if(i%3==0){
                System.out.println("FIZZ");
            }else if(i%5==0){
                System.out.println("BUZZ");
            }else{
                System.out.println(i);
            }



        }

    }


}
