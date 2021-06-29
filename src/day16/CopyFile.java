//package day16;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CopyFile {
//    private static ArrayList<String> list;
//
//    public List<String> changeList(String filePath){
//        List<String> list= new ArrayList<>();
//        try{
//            File file=new File(filePath);
//            if(!file.exists()){
//                throw new FileNotFoundException();
//            }
//            BufferedReader buf=new BufferedReader(new FileReader(filePath));
//            String line =" ";
//            if((line= buf.readLine())!=null){
//                list.add(line);
//            }
//        }catch (Exception e){
//            System.out.println("ko tìm thấy file hoặc k thể đọc");
//        }
//        return list;
//    }
//    public static void ghiFile(ArrayList<String> list){
//        CopyFile.list = list;
//        try{
//            File file =new File("result1.txt");
//            if(!file.exists()){
//                file.createNewFile();
//            }
//            FileWriter fileWriter=new FileWriter(file);
//            BufferedWriter buf=new BufferedWriter(fileWriter);
//            for (String x:list) {
//                buf.write(x);
//            }
//            buf.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    public static int count(ArrayList<String> list){
//        list.toString().length();
//    }
//}
