package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File file=new File("C:\\Users\\Admin\\Documents\\lap trinh Java\\hello.txt");
//            FileReader fileReader= new FileReader(file);
//            BufferedReader reader=new BufferedReader(fileReader);

            BufferedReader reader=new BufferedReader(new FileReader(file));
            String line=null;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
