package day16;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Admin\\Documents\\lap trinh Java\\hello1.txt");
            if (file.createNewFile()) {
                System.out.println("File is created");
            } else System.out.println("File already exist !");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
