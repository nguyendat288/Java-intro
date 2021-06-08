package buoi2;

import java.util.Scanner;

public class UCLN_BCNN{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a = ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = sc.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
    }

    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}

