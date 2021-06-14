package day6.point;

import java.util.Scanner;

public class point3D extends Point2D{
    private float z=0.0f;

    public point3D() {
    }

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr1={this.getX(),this.getY(),this.z};
        return arr1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        point3D p =new point3D(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        System.out.println(p.getXYZ());
    }

}
