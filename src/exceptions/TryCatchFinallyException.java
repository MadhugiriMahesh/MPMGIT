package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinallyException {

        public static void main(String[] args)  {
            File file = new File("c://myfile.txt");
            FileReader fr=null;
            try {
                fr = new FileReader(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    if(fr!=null)
                    {
                        fr.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("after exception");
        }
    }

