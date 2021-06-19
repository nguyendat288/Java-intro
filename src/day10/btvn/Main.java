package day10.btvn;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Quan Ly Can Bo");
        System.out.println("1. Them can bo");
        System.out.println("2. Tim kiem can bo theo ten");
        System.out.println("3. Xoa nhan vien");
        System.out.println("4. Sua can bo");
        System.out.println("5. Hien thi can bo");
        System.out.println("6. Sap xep can bo");
        System.out.println("7. Tim can bo theo nganh");
        System.out.println("8. Thoat");
        System.out.println("Chon di ban: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                Manager.addCanBo();
                break;
            case 2:
                Manager.find();
                break;
            case 3:
                Manager.xoaNhanVien();
                break;
            case 4:
                Manager.fixNhanVien();
                break;
            case 5:
                Manager.hienThi();
                break;
            case 6:

                break;
            case 7:
                Manager.findNganh();
                break;
            case 8:
                System.exit(0);
        }
    }
}
