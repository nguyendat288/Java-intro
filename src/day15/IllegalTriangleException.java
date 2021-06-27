package day15;

import java.util.Scanner;

public class IllegalTriangleException {
    private void check(int x, int y,int z) {
        try {
            int sum1 = x + y;
            int sum2=y+z;
            int sum3=x+z;
            int pre=x+y+z;
            if(x>0&&y>0&&z>0&&sum1>z&&sum2>x&&sum3>y)
                System.out.println(pre);
        } catch (Exception e) {
            System.err.println(" ko phải tam giác ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x : ");
        int x=sc.nextInt();
        System.out.println("Enter y : ");
        int y = sc.nextInt();
        System.out.println("Enter z : ");
        int z= sc.nextInt();
        IllegalTriangleException s=new IllegalTriangleException();
        s.check(x,y,z);
    }
}
