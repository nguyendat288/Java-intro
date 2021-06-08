package buoi2;

import java.util.Scanner;
public class checkPrimes {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x=sc.nextInt();
            boolean check =true;
            int i=2;
            if(x<2) {
                check =false;
            }
            else {
                while( i<x) {
                    if(x%i==0) {
                        check =false;
                        break;
                    }
                    i++;
                }
            }
            if(check) System.out.println("là số nguyên tố");
            else System.out.println("ko phải");
        }
    }

