package buoi3;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element you want to add ");
        int n = sc.nextInt();
        System.out.println("Enter the site you want to add the element : ");
        int index = sc.nextInt();
        int[] arr = {1, 24, 343, 4, 2, 3};
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            arr1[i] = arr[i];
        }
        arr1[index] = n;
        for (int i = index; i < arr.length; i++) {
            arr1[i + 1] = arr[i];
        }
        for (int x : arr1) {
            System.out.print(x + "  ");
        }
    }
}
