package exercise;

import java.util.Scanner;

public class PalindromeNumberDemo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int originalNumber=scanner.nextInt();
        int copiedOriginalNumber=originalNumber;
        int reversedNumber=0;

        while(copiedOriginalNumber!=0)
        {
            int reminder = copiedOriginalNumber%10;
            reversedNumber=(reversedNumber*10)+reminder;
            copiedOriginalNumber=copiedOriginalNumber/10;
        }
        System.out.println("Reversed Number Outcome : "+reversedNumber);
        if(reversedNumber==originalNumber)
        {
            System.out.println("Hurry Number is Palindrome");
        }
        else
        {
            System.out.println("Sorry Number is not Palindrome");
        }

        }
}
