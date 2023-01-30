package exercise.strings;

import java.util.LinkedHashSet;
import java.util.Set;

class RemoveDuplicateCharFromString {

    public static void main(String[]args){
        String str="Programming";

        //Using StringBuilder and Set

        StringBuilder sb = new StringBuilder();
        
        Set<Character> set = new LinkedHashSet<Character>();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character c : set){
            sb.append(c);
        }
        System.out.println(sb);

        //Using StringBuilder and IndexMethod

        StringBuilder sb1 = new StringBuilder();

        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            int indexPosition=str.indexOf(ch,i+1);
            if(indexPosition==-1){
                sb1.append(ch);
            }
        }
        System.out.print(sb1);

      }

}
