package buoi4;

import java.util.Scanner;

public class Retangle {
    private int width;
    private int height;
    public Retangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public Retangle(){

    }
    public int getArea(){
        return this.width*this.height;
    }
    public int getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
//    ==============================================================================
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter the width of the retangle : ");
 int width= sc.nextInt();
    System.out.print("Enter the height of the retangle : ");
    int height =sc.nextInt();
    Retangle retangle=new Retangle(width,height);
    System.out.println("Area = "+retangle.getArea());
    System.out.println("Perimeter = "+retangle.getPerimeter());
}
}
