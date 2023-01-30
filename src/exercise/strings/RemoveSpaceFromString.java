package exercise.strings;

public class RemoveSpaceFromString {

    public static void main(String[]args){
        String str="  ja  va  st a r ";
        String trimmedStr=str.replaceAll("\\s","");
        System.out.println("String without Space: "+trimmedStr);


    }

}
