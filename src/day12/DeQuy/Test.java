package day12.DeQuy;

public class Test {
    public static int sum(int a ){
 if(a>300)   {
     return 0;
 }
 return a+sum(a+3);
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
