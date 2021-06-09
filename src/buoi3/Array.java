package buoi3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng ");
        int n= sc.nextInt();
        int[] myClass = new int[n];
        int[] myList ={2,44,5,6,7};
        for(int i=0;i<n;i++){
            System.out.printf("myClass["+i+"] =");
            myClass[i]=sc.nextInt();
        }

        for(int x:myClass){
            System.out.print(x + "  ");
        }
    }

}
