package btvn1;

import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("QUản lý nhân viên");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Đuổi nhân viên");
            System.out.println("3. Hiển thị Lương theo tên ");
            System.out.println("4. Tìm kiếm theo tên ");
            System.out.println("5. Săp xếp theo tên nhân viên ");
            System.out.println("6. Hiển thị");
            System.out.println("7.Exit");
            System.out.println("Enter your choice ");
            int choise = Integer.parseInt(sc.nextLine());

            switch (choise) {
                case 1:
                   QLNV.addNhanVien();
                    break;
                case 2:
                    System.out.println("1. Nhan vien dao tao");
                    System.out.println("2. Nhan vien tuyen sinh");
                    int choiceRemove = Integer.parseInt(sc.nextLine());
                    if (choiceRemove == 1)
                       QLNV.removeNhanVien(1);
                    else QLNV.removeNhanVien(2);
                    break;
                case 3:
                    QLNV.ShowSalarybyName();
                    break;

                case 4:
                    QLNV.findByName();
                    break;
                case 5:
                   QLNV.sort();
                    break;
                case 6:
                    QLNV.show();
                    break;
                case 7:
                    System.exit(0);

            }
        }
    }
}
