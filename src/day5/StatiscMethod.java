package day5;

public class StatiscMethod {
    private int rollno;
    private String name;
    private static String college = "FPT";

    StatiscMethod(int r, String n) {
        rollno = r;
        name = n;
    }

    static void display() {
        college = "Codegym";
    }

    void display1() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

