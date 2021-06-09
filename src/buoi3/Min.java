package buoi3;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng ");
        int n = sc.nextInt();
        int[] myClass = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("myClass[" + i + "] =");
            myClass[i] = sc.nextInt();
        }
        int min=minValue(myClass);
        System.out.println("the smallest element in array have value  " + min);
    }
    public static int minValue(int[]myClass){
     int min=myClass[0];
     for(int i=0;i<myClass.length;i++){
         if(min>myClass[i]) {
             min=myClass[i];
         }
     }
return min;
    }
}
