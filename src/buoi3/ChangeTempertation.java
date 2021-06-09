package buoi3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChangeTempertation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int choice=-1;
        double celsius,fahrenheit;

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice : ");
        choice= input.nextInt();
        //===========================================================================
        switch (choice) {
            case 1:
                System.out.println("Enter the Fahrenheit : ");
                fahrenheit=input.nextFloat();
                celsius = (5.0 / 9) * (fahrenheit - 32);
                System.out.println("Result = " + celsius +" C");
                break;
            case 2:

                System.out.println("Enter the Celsius : ");
                celsius= input.nextFloat();
                fahrenheit = (9.0 / 5) * celsius + 32;
                System.out.println("Result = " + fahrenheit +" F");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
