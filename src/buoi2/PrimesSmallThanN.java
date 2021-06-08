package buoi2;

import java.util.Scanner;

public class PrimesSmallThanN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        System.out.printf("2 ");
        for (int i=3;i<n;i++){
            int j=2;
            while(i%j!=0){
                j++;
                if(j==i){
                    System.out.printf(i +" ");
                }
            }
        }


    }
}
