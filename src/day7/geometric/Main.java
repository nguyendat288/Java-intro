package day7.geometric;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(2);
        Retangle retangle=new Retangle(4,6);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percent ");
        double percent=sc.nextDouble();
        System.out.println(circle.toString());
        circle.resize(percent);
        System.out.println(retangle.toString());
        retangle.resize(percent);
    }
}
