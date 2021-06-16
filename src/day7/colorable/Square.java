package day7.colorable;

public class Square implements Colorable{
    private double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return this.width*this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    @Override
    public void howToColor(){
        if(this.getArea()>0){
        System.out.println( "Color all four sides");
    }else System.out.println("NO");
    }
}
