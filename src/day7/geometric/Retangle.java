package day7.geometric;

public class Retangle implements Resizeable {
    private double width;
    private double hight;

    public Retangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public Retangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "width=" + width +
                ", hight=" + hight +
                '}';
    }
    @Override
    public void resize(double percent){
        System.out.println("After change width = "+ (this.width*percent/100+this.width) +" hight = "+ (this.hight*percent/100+this.hight));
    }
}
