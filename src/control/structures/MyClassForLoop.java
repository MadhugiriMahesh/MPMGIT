package control.structures;

public class MyClassForLoop {

   public static void main (String[] args){
        MyClassForLoop myClass = new MyClassForLoop();
        myClass.forLoopCheck();

    }



    public void forLoopCheck(){

        for(int i = 0; i < 5; i++){
            System.out.println("i is " + i);
            if(i == 3){
                break;
            }
        }
    }

    public void forEachLoopCheck(){
        String[] myArray = {"a", "b", "c"};

        for(String str : myArray){
            System.out.println(str);
            if(str.equalsIgnoreCase("b")){
                break;
            }
        }
    }

    public void whileLoopCheck(){
        int i = 5;

        while(i > 0){
            System.out.println("i is " + i);
            i--;
            if(i == 3){
                break;
            }
        }

    }



}
