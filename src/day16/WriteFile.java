package day16;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writeFile = new FileWriter("C:\\Users\\Admin\\Documents\\lap trinh Java\\hello1.txt");
        writeFile.write("hello world !");
        writeFile.write("hello mother !");
        writeFile.write("hello brother !");
        writeFile.write("hello sister !");
        writeFile.close();
        }catch (IOException o) {
            o.printStackTrace();
        }

    }
}
