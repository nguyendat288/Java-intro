package buoi3;

import java.util.Scanner;

public class maxIn2DimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]arr={{1,2,3,4},{24,52,3,52},{5,73,74,32}};
        int max=arr[0][0];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
