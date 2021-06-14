package day6.moveablepoint;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        moveablePoint move1 = new moveablePoint(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(move1.getSpeed());
        System.out.println(move1.move());
    }
}
