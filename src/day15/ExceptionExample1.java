package day15;

public class ExceptionExample1 {

    public static void main(String[] args) {
        try {
            try {
                int zero = 0;
                int average = 10 / zero;
                System.out.println("Average = " + average);
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }

            System.out.println("Continue...");
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        System.out.println("Finished!");
    }



}
