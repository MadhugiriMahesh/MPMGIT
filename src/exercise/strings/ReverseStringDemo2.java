package exercise.strings;

public class ReverseStringDemo2 {

    public static void main(String[]args){
        String str="Alexander";
        int size= str.length();
        String reversedString="";

        for(int i=size-1;i>=0;i--)
        {
            reversedString=reversedString+str.charAt(i);

        }
        System.out.println("Outcome of the Reversed String data: "+reversedString);


    }

}
