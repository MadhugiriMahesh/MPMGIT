package exercise;

import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String Text:");
        String originalText=scanner.nextLine();

        char[] ch = originalText.toCharArray();
        int size=ch.length;
        String reversedText="";
        for(int i=size-1;i>=0;i--)
        {
            reversedText = reversedText +ch[i];
        }
        System.out.println("Reversed Text Outcome : "+reversedText);
        if(originalText.equals(reversedText))
        {
            System.out.println("Hurry Text is Palindrome");
        }
        else
        {
            System.out.println("Sorry Text is not Palindrome");
        }
    }
}
