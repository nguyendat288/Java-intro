package buoi3;

import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi ");
        String str = "ha noi hom nay mua to qua";
        System.out.println("chu can tim ");
        char x=sc.next().charAt(0);
        int count=0;
        String s="Welcome to Java Programming";
        char arr[]=str.toCharArray();
//        for(int i=0;i<arr.length;i++){
//            System.out.println("Data at ["+i+"]="+arr[i]);
//        }

//        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println("Phan tu tren xuat hien "+count+" lan");
    }
}
