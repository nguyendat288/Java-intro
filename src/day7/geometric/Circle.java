package day7.geometric;

public class Circle implements Resizeable{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public void resize(double percent){
        System.out.println("After change : radius = "+ (this.radius*percent/100+this.radius));
    }
}
