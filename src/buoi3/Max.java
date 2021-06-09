package buoi3;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng ");
        int n = sc.nextInt();
        int[] myClass = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("myClass[" + i + "] =");
            myClass[i] = sc.nextInt();

        }
        int b;
        for (int i = 0; i < myClass.length - 1; i++) {
            for (int j = i + 1; j < myClass.length; j++) {
                if (myClass[i] < myClass[j]) {
                    b = myClass[i];
                    myClass[i] = myClass[j];
                    myClass[j] = b;
                }
            }
        }
        for (int x : myClass) {
            System.out.print(x + "  ");
        }
    }
}
