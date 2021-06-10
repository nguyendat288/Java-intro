package buoi3;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 6, 7,8,2,4,2,5,2,2,2,4,5};
        int [] arr1=new int[arr.length-1];
        System.out.println("Enter the element you want to delete : ");
        int a = sc.nextInt();
        int c, i;
        int count=0;
        for (c = i = 0; i < arr.length; i++) {
            if (arr[i] != a) {
                arr1[c] = arr[i];
                c++;
            count++;
            }
        }
        int[] arr2=new int[count];
        for(int j=0;j<count;j++){
            arr2[j]=arr1[j];
        }
        for (int x : arr2) {
            System.out.print(x + "  ");

        }
    }
}
