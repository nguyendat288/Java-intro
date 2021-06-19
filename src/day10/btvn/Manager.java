package day10.btvn;
import java.util.ArrayList;
import java.util.Scanner;
public class Manager{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<CanBo> list = new ArrayList<>();

    public static void addCanBo() {
        while (true) {
            System.out.println("Cán Bộ : ");
            System.out.println("1. Nhân Viên");
            System.out.println("2. Kỹ Sư");
            System.out.println("3. Công Nhân ");
            System.out.println("4. Exit");
            int x = Integer.parseInt(sc.nextLine());
            switch (x) {
                case 1:
                    addNhanVien();
                    break;
                case 2:
                    addKySu();
                    break;
                case 3:
                    addCongNhan();
                    break;
                default:
                    break;
            }
        }
    }

    public static void addNhanVien() {
        System.out.println("Nhap Ho ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Gioi tinh: ");
        String gender = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String address = sc.nextLine();
        list.add(new NhanVien(name, age, gender, address));
    }

    public static void addKySu() {
        System.out.println("Nhap Ho ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Gioi tinh: ");
        String gender = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String address = sc.nextLine();
        System.out.println("Nhap nganh : ");
        String nganh = sc.nextLine();
        list.add(new KySu(name, age, gender, address, nganh));
    }

    public static void addCongNhan() {
        System.out.println("Nhap Ho ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap Nam sinh: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Gioi tinh: ");
        String gender = sc.nextLine();
        System.out.println("Nhap Dia chi: ");
        String address = sc.nextLine();
        System.out.println("Nhap bac ");
        String bac = sc.nextLine();
        System.out.println("Nhap nganh : ");
        String nganh = sc.nextLine();

        list.add(new CongNhan(name, age, gender, address, bac, nganh));
    }

    public static void find() {
        System.out.println("Nhap ten: ");
        String name1 = sc.nextLine();
        int index = list.indexOf(name1);
        if (index < 0) {
            System.out.println("Khong co ket qua!");
        } else {
            System.out.println(list.get(index));
        }
    }
    public static void xoaNhanVien() {
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        for (CanBo x: list) {
            if (x instanceof NhanVien && x.getName().equals(name)) {
                list.remove(x);
            }
        }
    }
    public static void fixNhanVien(){
            System.out.println("Nhap ten cần sửa: ");
            String name = sc.nextLine();
            System.out.println("----Thong tin moi----");
            System.out.println("Nhap ten moi: ");
            String newname = sc.nextLine();
            System.out.println("Nhap Nam sinh: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap Gioi tinh: ");
            String gender = sc.nextLine();
            System.out.println("Nhap Dia chi: ");
            String address = sc.nextLine();
            NhanVien nhanVien = new NhanVien(newname, age, gender, address);
            int index = list.indexOf(name);
            list.set(index, nhanVien);
    }
    public static void hienThi() {
        for (CanBo x: list) {
            list.toString();
        }
    }
    public static void findNganh() {
        System.out.println("Nhap nganh: ");
        String Nganh = sc.nextLine();
        for (CanBo x: list) {
            if (x instanceof CongNhan) {
                if (((CongNhan) x).getNganh().equals(Nganh)) {
                    x.toString();
                }
            } else if (x instanceof KySu) {
                if (((KySu) x).getNganh().equals(Nganh)) {
                    x.toString();
                }
            }
        }
    }
}
