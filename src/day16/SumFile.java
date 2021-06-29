package day16;

import java.io.*;

public class SumFile {
    public void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
//                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("result : " + sum);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\Documents\\lap trinh Java\\hello.txt";

        SumFile readfileEx = new SumFile();
        readfileEx.readFile(path);
    }
}
