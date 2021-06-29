package day16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MaxFile {
public List<Integer> changeList(String filePath){
    List<Integer> list=new ArrayList<>();
    try{
        File file =new File(filePath);

        if(!file.exists()){
            throw new FileNotFoundException();
        }
        BufferedReader buff=new BufferedReader(new FileReader(filePath));
        String line=" ";
        while((line=buff.readLine())!=null){
            list.add(Integer.parseInt(line));
        }
        buff.close();
    }catch (Exception e){
        System.err.println("File ko tồn tại hoặc lỗi");
    }
    return list;
}
public static int findMax(List<Integer> list){
int max=list.get(0);
for(int i=0;i<list.size();i++){
    if(list.get(i)>max){
        max=list.get(i);
    }
}
return max;
}
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MaxFile readAndWriteFile = new MaxFile();
        List<Integer> numbers = readAndWriteFile.changeList("C:\\Users\\Admin\\Documents\\lap trinh Java\\hello.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
//        System.out.println("Số lớn nhất là "+ maxValue);
    }
}
