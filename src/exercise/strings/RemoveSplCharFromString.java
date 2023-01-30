package exercise.strings;

public class RemoveSplCharFromString {

    public static void main(String[]args){
        String str="$ja!va$&st%ar";
        String withoutSplChar=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Plain String: "+withoutSplChar);


    }

}
