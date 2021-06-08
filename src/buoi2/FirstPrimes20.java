package buoi2;

import java.util.Scanner;

public class FirstPrimes20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=1;
        System.out.printf("2 ");
         for (int num=2;count<n;num++){
             int i=2;
             while(num%i!=0){
                 i++;
                 if(i==num){
                     System.out.printf(num +" ");
              count++;
                 }
             }
         }

        }
        }


