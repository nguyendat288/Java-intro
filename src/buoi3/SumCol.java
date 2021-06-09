package buoi3;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Col= sc.nextInt();
        int sum=0;
        int[][]arr={{1,2,3,7},{2,5,7,4},{5,7,9,3}};
            for(int j=0;j<arr.length;j++){
               sum+=arr[j][Col];
            }
        System.out.println(sum);
    }

}
