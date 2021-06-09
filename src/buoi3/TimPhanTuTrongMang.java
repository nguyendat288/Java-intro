package buoi3;

import java.util.Scanner;

public class TimPhanTuTrongMang {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            boolean check=false;
            int b=0;
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
            for (int i = 0; i < students.length; i++) {
                if(students[i].equals(str)){
                    check =true;
                    b=i;
                }

            }
            if(check) System.out.println("chứa phần tử đã nhập ở vị trí "+ b);
            else System.out.println("ko chứa");
    }
}
