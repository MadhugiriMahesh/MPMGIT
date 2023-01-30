package file.operations;

import java.io.*;

public class MyFileCreationInputStreamOutputStream {

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
        //Writing to the file using OutputStream
        try {
            FileOutputStream os = new FileOutputStream(file);
            String str = "My String";
            os.write(str.getBytes());
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading the text char by char from the file using InputStream
        try {
            FileInputStream is = new FileInputStream(file);
            int i;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
