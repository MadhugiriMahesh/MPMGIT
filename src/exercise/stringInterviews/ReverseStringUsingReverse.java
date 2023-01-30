package exercise.stringInterviews;

public class ReverseStringUsingReverse {

     public static void main(String[] args) {
         reverseInputString("abc");

     }

         public static void reverseInputString(String input){
             StringBuilder sb=new StringBuilder(input);
             String result=sb.reverse().toString();
             System.out.println(result);
         }


}



