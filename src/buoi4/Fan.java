package buoi4;

import java.util.Scanner;

public class Fan {
   private int speed;
   private boolean on;
   private double radius;
   private String color;

   public Fan() {
      this.speed = speed;
      this.radius = radius;
      this.color = color;
      this.on = on;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public void setSpeed(int speed) {
      this.speed = speed;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public void setOn(boolean on) {
      this.on = on;
   }

   public double getRadius() {
      return this.radius;
   }

   public int getSpeed() {
      return this.speed;
   }

   public String getColor() {
      return this.color;
   }

   public boolean getOn() {
      return this.on;
   }
public String toString1(){
      return "fan is on";
}
public String toString2(){
      return "fan is off";
}
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Fan fan1=new Fan();
      Fan fan2=new Fan();
      System.out.print("Enter the radius ");
      double radius=sc.nextDouble();
      System.out.print("Enter the speed ");
      int speed=sc.nextInt();
      System.out.print("Enter the color ");
      sc.nextLine();
      String color=sc.nextLine();
      System.out.print("Enter the status ");
      boolean on=sc.nextBoolean();
      fan1.setRadius(radius);
      fan1.setSpeed(speed);
      fan1.setColor(color);
      fan1.setOn(on);
      fan1.getRadius();
      fan1.getSpeed();
      fan1.getColor();
      fan1.getOn();
      if(fan1.getOn()){
         System.out.println(fan1.getSpeed()+" "+ fan1.getRadius()+" "+fan1.getColor()+" "+fan1.toString1());
      }else System.out.println(fan1.getSpeed()+" "+ fan1.getRadius()+" "+fan1.getColor()+" "+fan1.toString2());

   }
}
