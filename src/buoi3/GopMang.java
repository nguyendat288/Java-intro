package buoi3;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng arr ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] =");
            arr[i] = sc.nextInt();

        }
        System.out.println("Nhập số phần tử của mảng arr1 ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("arr1[" + i + "] =");
            arr1[i] = sc.nextInt();

        }
        int[] arr2 = new int[n + m];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[n + i] = arr1[i];
        }
        for (int x : arr2) {
            System.out.print(x + "  ");
        }
    }
}
