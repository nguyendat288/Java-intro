package day15;

import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("vô số nghiệm ");
            }else System.out.println("vô nghiệm ");
        }else System.out.println("nghiệm là "+ (-b/a));
    }
}
