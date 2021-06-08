package buoi2;

import java.util.Scanner;
    public class Interest {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter month =");
            int month =sc.nextInt();
            System.out.println("Enter money=");
            float money=sc.nextFloat();

            float moneyinterest=0;
            System.out.println("Enter lãi suất ");
            float laisuat =sc.nextFloat();
            for(int i=1;i<= month;i++){
                money+=moneyinterest;
                moneyinterest=money *  laisuat/100/ 12 * month;
            }
            System.out.println("total = "+ money);
        }
    }


