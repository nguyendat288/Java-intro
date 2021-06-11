package day5.employee;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;

        Student1[] Student=new Student1[1];
        while (x != 0) {
            System.out.println("Quản lý học sinh : ");
            System.out.println("1. Thêm ");
            System.out.println("2. Sửa ");
            System.out.println("3. Xoá ");
            System.out.println("4. Hiển thị ");
            System.out.printf("0. Thoát ");
            System.out.println("Nhập lựa chọn của bạn : ");
            int count=0;
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.print("Nhập id của học sinh ");
                    int id = sc.nextInt();
                    System.out.print("Nhập tên của học sinh ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Nhập giới tính ");
                    String gender = sc.nextLine();
                    System.out.print("Nhập tuổi ");
                    int age = sc.nextInt();
                    Student1 hs1 = new Student1(id, name, gender, age);
                    Student[count]=hs1;
                    count++;
                    for (Student1 y : Student){
                        System.out.println(y);
                    }
                    break;
            }


        }
    }
}
