package buoi3;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 6, 7, 8};
        int [] arr1=new int[arr.length-1];
        System.out.println("Enter the element you want to delete : ");
        int a = sc.nextInt();
        int c, i;
        for (c = i = 0; i < arr.length; i++) {
            if (arr[i] != a) {
                arr1[c] = arr[i];
                c++;
            }
        }
        for (int x : arr1) {
            System.out.print(x + "  ");

        }
    }}
