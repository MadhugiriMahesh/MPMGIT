package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionWithOneCatch {
    public static void main(String[] args) {
        File file = new File("c://myfile.txt");
        try (FileReader fr = new FileReader(file)) {
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("after exception");
    }

}
