package btvn1;

import day13.DienNuoc.KhachHang;
import day13.DienNuoc.KhachHangNuocNgoai;
import day13.DienNuoc.KhachHangVietNam;
import day6.quanli.NhanVienFullTime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLNV {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<NhanVien> list = new ArrayList<>();

    public static void addNhanVien() {
            System.out.println("Thêm Nhân Viên ");
            System.out.println("1. Nhân Viên đào tạo ");
            System.out.println("2.Nhân Viên tuyển sinh ");
            System.out.println("3.Exit");
            System.out.print("Enter your choice ");
            int x = Integer.parseInt(sc.nextLine());
            switch (x) {
                case 1:
                    System.out.println("1.Nhân viên FullTime");
                    System.out.println("2.Nhân Viên partTime ");
                    System.out.print("Enter your choice");
                    int y = Integer.parseInt(sc.nextLine());
                    switch (y) {
                        case 1:
                            NhanVien nhanvien = addNV("full");
                            list.add(nhanvien);
                            break;
                        case 2:
                            NhanVien nhanvien1 = addNV("part");
                            list.add(nhanvien1);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    NhanVien nhanvien = addNV("tuyen sinh");
                    list.add(nhanvien);
                    break;
            }
    }

    public static NhanVien addNV(String type) {
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        int age = getAge();
        String gender = getGender();
        System.out.println("Enter the phone number ");
        String phone = sc.nextLine();
        System.out.println("Enter the email ");
        String email = sc.nextLine();
        int salary=getSalary();
        if (type.equals("tuyen sinh")) {
            System.out.println("Nhập số tuyển sinh ");
            int soTuyenSinh = Integer.parseInt(sc.nextLine());
            return new NvTuyenSinh(name, age, gender, phone, email, salary,soTuyenSinh );
        }else {
            if(type.equals("full")){
                System.out.println("Enter the ngành");
                String nganh =sc.nextLine();
                return new NvDaoTaoFullTime(name, age, gender, phone, email, salary,nganh);
            }else{
                System.out.println("Enter the ngành ");
                String nganh=sc.nextLine();
                System.out.println("Enter the time ");
                int time=Integer.parseInt(sc.nextLine());
                return new NvDaoTaoPartTime(name, age, gender, phone, email, salary,nganh,time);
            }
        }

    }
    public static int getAge(){
        while (true) {
            try {
                System.out.println("Nhap tuoi: ");
                int age = Integer.parseInt(sc.nextLine());
                if (age < 18)
                    throw new AgeCond();
                else
                    return age;
            } catch (AgeCond e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static String getGender(){
        while (true){
            try{
                System.out.println("Enter gender ");
                String gender=sc.nextLine();
                if(gender.equals("nam")||gender.equals("nu")){
                    return gender;
                }else
                   throw new GenderCond();
            }catch (GenderCond e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static int getSalary(){
        while (true) {
            try {
                System.out.println("Nhap luong: ");
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Sai dinh dang");
            }
        }
    }
    public static void removeNhanVien(int typeNv) {
        System.out.println("Enter a name: ");
        String name = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (typeNv == 1) {
                if (list.get(i).getName().equals(name)) {
                    if (list.get(i) instanceof NvDaoTaoPartTime || list.get(i) instanceof NvDaoTaoFullTime) {
                        list.remove(i);
                        i--;
                    }
                }
            } else if (typeNv == 2) {
                if (list.get(i).getName().equals(name)) {
                    if (list.get(i) instanceof NvTuyenSinh) {
                        list.remove(i);
                        i--;
                    }
                }
            }
        }
    }
    public static void ShowSalarybyName() {
        System.out.println("Enter name ");
        String name=sc.nextLine();
        for(NhanVien x:list){
           if (x.getName().equals(name)){
               System.out.println(name +" : "+ x.doanhThu());
           }
        }

        }
    public static void findByName() {
        System.out.println("Nhap name: ");
        String name = sc.nextLine();
        for (NhanVien x: list) {
        if(x.getName().equals(name)){
            System.out.println(x);
        }
        }
    }
    public static void sort(){
        list.sort(Comparator.comparing(o->((NhanVien)o).getName()));
    }
    public static void show(){
        for(NhanVien x:list){
            System.out.println(x);
        }
    }

}
