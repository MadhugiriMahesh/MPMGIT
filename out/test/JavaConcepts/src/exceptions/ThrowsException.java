package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsException {
    //Here we just postpone the exception
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("c://myfile.txt");
        FileReader fr = new FileReader(file);
        System.out.println("after exception");
    }
}
