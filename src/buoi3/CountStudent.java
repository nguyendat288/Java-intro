package buoi3;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số học sinh : ");
        int n = sc.nextInt();
        int[] myClass = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Điểm của học sinh thứ " + i + "] =");
            myClass[i] = sc.nextInt();

        }
        int count=0;
    for(int i=0;i<myClass.length;i++){
        if(myClass[i]>=5&&myClass[i]<=10){
            count++;
        }
    }
        System.out.println("Số học sinh qua môn là : "+ count);
    }

}
