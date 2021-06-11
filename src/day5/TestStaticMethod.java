package day5;

public class TestStaticMethod {
    public static void main(String args[]) {
        StatiscMethod.display(); //calling change method

        //creating objects
        StatiscMethod s1 = new StatiscMethod(111, "Hoang");
        StatiscMethod s2 = new StatiscMethod(222, "Khanh");
        StatiscMethod s3 = new StatiscMethod(333, "Nam");

        //calling display method
        s1.display1();
        s2.display1();
        s3.display1();
    }
}
