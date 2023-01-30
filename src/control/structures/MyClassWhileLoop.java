package control.structures;

public class MyClassWhileLoop {

    public static void main(String[] args) {
        MyClassWhileLoop myClass = new MyClassWhileLoop();
        myClass.whileLoopCheck();

    }

    public void whileLoopCheck() {
        int i = 5;

        while (i > 0) {
            System.out.println("i is " + i);
            i--;
            if (i == 1) {
                break;
            }
        }

    }


}
