package exceptions;

import java.io.File;

public class MyClassUserDefined {
    public static void main (String[] args) {

        File file = new File("c://myfile.txt");
        try {
            System.out.println("random");
            throw new MyException();
        } catch (MyException e) {
            e.printException();
            e.printStackTrace();
        }
        System.out.println("after exception");
    }
}

