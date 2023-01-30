package control.structures;

public class MyClassIfElseLoop {


    public static void main (String[] args){
        MyClassIfElseLoop myClass = new MyClassIfElseLoop();
        myClass.ifElseCheck();

    }

    public void ifElseCheck(){
        boolean flag = false;
        String str = "myStr";

        if(str.equalsIgnoreCase("myStr") && flag){
            System.out.println("I'm in if");
        } else {
            System.out.println("I'm in else");
        }
    }


}
