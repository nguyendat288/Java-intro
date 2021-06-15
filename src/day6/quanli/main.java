package day6.quanli;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("id");
        int id=sc.nextInt();
        System.out.println("tên ");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("tuổi");
        int age=sc.nextInt();
        System.out.println("phone");
        long phone=sc.nextLong();
        System.out.println("mail ");
        sc.nextLine();
        String mail=sc.nextLine();
        System.out.println("tiền thưởng ");
        long tienthuong=sc.nextLong();
        System.out.println("tiền phạt ");
        long tienphat=sc.nextLong();
        System.out.println(" lương cứng ");
        long luongcung=sc.nextLong();
        NhanVienFullTime nv1=new NhanVienFullTime(id,name,age,phone,mail, tienthuong,tienphat,luongcung);
        System.out.println(nv1.toString());
    }
}
