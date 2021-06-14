package day6.shape;

import java.util.Scanner;

public class Circle extends Geometric {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
    public double getPerime(){
        return 2*3.14*this.radius;
    }
    public double getDiameter(){
        return 2*this.radius;
    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        double radius= sc.nextDouble();
        Circle circle =new Circle(sc.nextLine(),sc.nextBoolean(),sc.nextDouble());
        System.out.println(circle.getArea());
        System.out.println(circle.getDiameter());
        System.out.println(circle.getPerime());
        System.out.println(circle.getColor());
        System.out.println(circle.getFilled());
    }
}
