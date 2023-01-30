package file.operations;

import java.io.*;

public class MyFileCreationWriteReader {

    public static void main(String[]args){
        //Creation of the file
        File file = new File("MaheshFile.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //Writing to the file
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("First Line MP");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading the text char by char from the file
        try {
            FileReader fr = new FileReader(file);
            int i;
            while((i= fr.read())!= -1){
                System.out.print((char)i);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
