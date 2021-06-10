package buoi4;

public class toString1 {
    private int radius;

    public toString1(int radius){
        this.radius=radius;
    }
    public toString1(){
    }


    @Override
    public String toString(){
        return "abc"+this.radius;
    }

    public static void main(String[] args) {
        toString1 test= new toString1(5);

        System.out.println(test.toString());
    }
}
