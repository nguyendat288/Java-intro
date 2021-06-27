package day15;

import java.util.Random;
import java.util.Scanner;

public class IndexOutOfBoundsException {
    public Integer[] creatRandom(){
        Random rd=new Random();
        Integer[] arr=new Integer[10];
        System.out.println("Danh sach phan tu mang : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(100);
            System.out.println(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        IndexOutOfBoundsException arrayExamples=new IndexOutOfBoundsException();
        Integer[] arr = arrayExamples.creatRandom();
        Scanner sc= new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của phần tử bất kỳ : ");
        int x=sc.nextInt();
        try{
            System.out.println("Giá trị của phần tử thứ "+x+" là "+arr[x]);
        }catch (java.lang.IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt giới hạn của mảng");
        }
    }
}
