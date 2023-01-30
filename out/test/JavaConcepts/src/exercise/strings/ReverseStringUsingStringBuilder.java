package exercise.strings;

public class ReverseStringUsingStringBuilder {

    public static void main(String[]args){
        String str="Alexander";
        String reversedString="";

        StringBuilder sb = new StringBuilder(str);
        reversedString=reversedString+sb.reverse();

        System.out.println("Outcome of the Reversed String data: "+reversedString);


    }

}
