package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeException {

    // Remove throws exception from the method signature

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("c://myfile.txt");
        FileReader fr = new FileReader(file);
    }
}
