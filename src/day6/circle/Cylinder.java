package day6.circle;

import java.util.Scanner;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getSurroundingarea(){
        return 2*3.14*this.getRadius()*this.height;
    }
    public double getVolume(){
        return 3.14*this.getRadius()*this.getRadius()*this.height;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius= sc.nextDouble();
        sc.nextLine();
        String color=sc.nextLine();
        double height=sc.nextDouble();
        Cylinder cylinder=new Cylinder(radius,color,height);
        System.out.println(cylinder.getSurroundingarea());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getColor());
    }
}
