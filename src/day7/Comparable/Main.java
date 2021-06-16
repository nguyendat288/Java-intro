package day7.Comparable;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circle=new ComparableCircle[3];
        circle[0]= new ComparableCircle(3);
        circle[1]=new ComparableCircle(5);
        circle[2]=new ComparableCircle(2);
        System.out.println(" sort : ");
        for(ComparableCircle x:circle){
            System.out.println(x);
        }
        Arrays.sort(circle);
        System.out.println(" after ");
        for(ComparableCircle x:circle){
            System.out.println(x);
        }
    }
}
