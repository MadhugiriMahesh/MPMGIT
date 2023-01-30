package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionWithResources {
    public static void main(String[] args) {
        File file = new File("c://myfile.txt");
        try (FileReader fr = new FileReader(file)) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("after exception");
    }

}
