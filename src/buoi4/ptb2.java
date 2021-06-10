package buoi4;

import java.util.Scanner;

public class ptb2 {
    private double a;
    private double b;
    private double c;
    public ptb2(double a,double b,double c){
this.a=a;
this.b=b;
this.c=c;
    }
    public double getDiscriminant(){
        return this.b*this.b-4*this.a*this.c;
    }
    public double getRoot1(){
        return (-this.b-Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);
    }
    public double getRoot2(){
        return (-this.b+Math.sqrt(this.b*this.b-4*this.a*this.c))/(2*this.a);

    }
    public double getRoot3(){
        return (-this.b)/(2*this.a);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a =sc.nextDouble();
        double b =sc.nextDouble();
        double c =sc.nextDouble();
        ptb2 getptb2 =new ptb2(a,b,c);
        if(getptb2.getDiscriminant()>0){
            System.out.println("The equation has two roots"+ getptb2.getRoot1() +"and " + getptb2.getRoot2());
        }else if(getptb2.getDiscriminant()==0)
            System.out.println("The equation has one root is "+getptb2.getRoot3());
     else System.out.println("The equation has no real roots");
    }
}
