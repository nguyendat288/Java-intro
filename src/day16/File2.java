//package day16;
//import java.io.File;
//import java.io.FileReader;
//
//public class File2 {
//    public static void main(String[] args) {
//
//        File dir =new File("hello");
//       if(!dir.exists()){
//           dir.mkdir();
//       }
//        File file =new File("hello/test.txt");
//        if(!file.exists()){
//            file.createNewFile();
//        }
//
//
//        FileReader fileReader=new FileReader(file);
//        int c= fileReader.read();
//        while (c!=-1){
//            System.out.println((char)c);
//            c=fileReader.read();
//        }
//        fileReader.close();
//    }
//}
