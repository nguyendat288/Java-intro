package day5.employee;

import java.util.Scanner;

public class Main {
    public static Student[] students = new Student[100];
    public static int k = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;

        while (x != 6) {
            System.out.println("Menu");
            System.out.println("1.Thêm");
            System.out.println("2.Sửa");
            System.out.println("3.Xoá");
            System.out.println("4.Tìm kiếm theo id");
            System.out.println("5.Hiển thị");
            System.out.println("6.Exit");
            System.out.print("Enter your choice : ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    Menu.addStudent(students, k);
                    k++;
                    break;
                case 2:
                    System.out.println("Enter the id ");
                    Menu.changeInfo(students, sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the id ");
                    students = Menu.removeStudent(students, sc.nextInt());
                    k--;
                    break;
                case 4:
                    System.out.println("Enter the id ");
                    Student st = Menu.findStudent(students, sc.nextInt());
                    System.out.println(st);
                    break;
                case 5:
                    for (int i = 0; i < k; i++) {
                        System.out.println(students[i]);
                    }
                    break;
            }
        }
        System.out.println("Ended!~");
    }
}

