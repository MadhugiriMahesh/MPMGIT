package exercise.stringInterviews;

public class CountCharacter {
    //How to count the occurrence of the given character in a string?

    public static void main(String[]args){
        String inputString="coderolls";
        char ch='l';
        int count=0;

        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)==ch) {
                count++;
            }
        }
        System.out.println("The Character "+ch+" found "+count+" times in a given input string");
    }
}
