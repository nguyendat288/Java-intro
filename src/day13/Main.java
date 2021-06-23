package day13;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Quả lý Khách hàng");
            System.out.println("1. Thêm khách hàng ");
            System.out.println("2. Sửa khách hàng ");
            System.out.println("3. Xoa khách hàng");
            System.out.println("4. Tìm khách hàng theo tên ");
            System.out.println("5. Tìm khách hàng theo mã khách hàng ");
            System.out.println("6. Sắp xếp khách hàng theo id ");
            System.out.println("7.Hiển thị");
            System.out.println("8. Exit");
            System.out.println("Enter your choice :  ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                   QLKH.addKhachHang();
                    break;
                case 2:
                    QLKH.fix();
                    break;
                case 3:
                    QLKH.xoaKhachHang();
                    break;
                case 4:
                    QLKH.findName();
                    break;
                case 5:
//                    ArrayList<KhachHang> array, int left, int right, int value
                   QLKH.findID();
                    break;
                case 6:
                    QLKH.sort();
                    break;
                case 7:
                    QLKH.show();
                    break;
                case 8:
                    System.exit(0);
            }
        }
    }
}

