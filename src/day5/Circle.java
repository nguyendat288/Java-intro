package day5;

public class Circle {
     double radius;
     String color="red";

    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius(){
        return this.radius=radius;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }

    public static void main(String[] args) {
        Circle circle=new Circle(1.0);
        circle.getRadius();
        System.out.println(circle.getArea());
    }
}
