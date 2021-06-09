package buoi3;


import java.util.Scanner;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng ");
        int n = sc.nextInt();
        int[] myClass = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("myClass[" + i + "] =");
            myClass[i] = sc.nextInt();
        }
        int[] myClass1=new int[n];
        for (int i = 0; i < myClass.length; i++) {
            myClass1[n-i-1]=myClass[i];
        }
        for (int x : myClass1) {
            System.out.print(x + "  ");
        }
    }
}


