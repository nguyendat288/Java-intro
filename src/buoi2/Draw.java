package buoi2;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int choice=-1;
        int a,b;
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice : ");
        choice= input.nextInt();
        //===========================================================================
        switch (choice) {
            case 1:
                a= input.nextInt();
                for(int i=0;i<a;i++){
                    for(int j=0;j<a;j++){
                        if(i<=j) System.out.printf("*");
                        System.out.printf("  ");
                    }
                    System.out.printf("\n");
                }

                break;
            case 2:
                a= input.nextInt();
                for(int i=0;i<a;i++){
                    for(int j=0;j<a;j++){
                        if(j<=a||i<=a) System.out.printf("*");
                        System.out.printf("  ");
                    }
                    System.out.printf("\n");
                }
                break;
            case 3:
                a= input.nextInt();
                b= input.nextInt();
                for(int i=0;i<a;i++){
                    for(int j=0;j<b;j++){
                        if(i<=a||j<=b) System.out.printf("*");
                        System.out.printf("  ");
                    }
                    System.out.printf("\n");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
