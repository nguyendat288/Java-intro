package day7.colorable;

public class Main {
    public static void main(String[] args) {
        Square[] square=new Square[3];
        square[0]=new Square(2.0);
        square[1]=new Square(4.5);
        square[2]=new Square(0.0);
for(Square x: square){
    System.out.println(x);
    x.howToColor();
}
    }
}
