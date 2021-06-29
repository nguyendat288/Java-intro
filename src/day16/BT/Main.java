package day16.BT;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   static Scanner sc= new Scanner(System.in);
    static ArrayList<People> list=new ArrayList<>();
    static File people=new File("C:\\Users\\Admin\\Documents\\lap trinh Java\\People.txt");

    public static void ghiFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(people);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (People pp : list) {
                bufferedWriter.write(pp.ghi());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }


    public static void docFile() throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(people);
            bufferedReader=new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 4) {
                    list.add(new People(str[0], Integer.parseInt(str[1].trim()), str[2], str[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
    }

        public static void main(String[] args) throws IOException {
            docFile();
            for (People pp : list) {
                System.out.println(pp);
            }
            list.add(new People("Dat",20,"nam","21482739"));
            list.add(new People("qgr",20,"nam","21482739"));
            list.add(new People("viet",20,"nam","21482739"));
            list.add(new People("Dung",20,"nam","21482739"));
            list.add(new People("Hung",20,"nam","21482739"));
            ghiFile();



    }
}
