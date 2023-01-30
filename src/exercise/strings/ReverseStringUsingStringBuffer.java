package exercise.strings;

public class ReverseStringUsingStringBuffer {

    public static void main(String[]args){
        String str="Alexander";
        String reversedString="";

        StringBuffer sb = new StringBuffer(str);
        reversedString=reversedString+sb.reverse();

        System.out.println("Outcome of the Reversed String data: "+reversedString);


    }

}
