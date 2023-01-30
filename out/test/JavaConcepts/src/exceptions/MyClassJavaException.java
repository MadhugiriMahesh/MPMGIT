package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClassJavaException {

    public static void main (String[] args) {

        File file = new File("c://myfile.txt");
        try {
            System.out.println("random");
            throw new Exception("java exception!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after exception");
    }
}
