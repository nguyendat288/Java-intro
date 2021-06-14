package day6.shape;

import java.util.Scanner;

public class Retangle extends Geometric {
private double width;
private double height;

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Retangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Retangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPrimeter(){
        return 2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Retangle retangle=new Retangle(sc.nextLine(),sc.nextBoolean(),sc.nextDouble(),sc.nextDouble());
        System.out.println(retangle.getArea());
        System.out.println(retangle.getPrimeter());
    }
}
