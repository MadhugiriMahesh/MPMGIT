package control.structures;

public class MyClassForEachLoop {

    public static void main(String[] args) {
        MyClassForEachLoop myClass = new MyClassForEachLoop();
        myClass.forEachLoopCheck();

    }

    public void forEachLoopCheck() {
        String[] myArray = {"a", "b", "c"};

        for (String str : myArray) {
            System.out.println(str);
            if (str.equalsIgnoreCase("b")) {
                break;
            }
        }
    }


}
