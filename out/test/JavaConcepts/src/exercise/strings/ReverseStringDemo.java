package exercise.strings;

public class ReverseStringDemo {

    public static void main(String[]args){
        String str="Alexander";
        char[] ch=str.toCharArray();
        int size= ch.length;
        String reversedString="";

        for(int i=size-1;i>=0;i--)
        {
            reversedString=reversedString+ch[i];

        }
        System.out.println("Outcome of the Reversed String data: "+reversedString);


    }

}
