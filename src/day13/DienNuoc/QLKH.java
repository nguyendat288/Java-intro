package day13.DienNuoc;

import day13.DienNuoc.KhachHang;
import day13.DienNuoc.KhachHangNuocNgoai;
import day13.DienNuoc.KhachHangVietNam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QLKH {
static ArrayList<KhachHang> list=new ArrayList<>();
static Scanner sc=new Scanner(System.in);
public static void addKhachHang(){
    while (true){
        System.out.println("Khách Hàng : ");
        System.out.println("1. khách Hàng VIệt Nam");
        System.out.println("2.Khách hàng nước ngoài ");
        System.out.println("3.Exit");
        System.out.println("Enter your choice ");
        int x=Integer.parseInt(sc.nextLine());
        switch (x){
            case 1:
                addVN();
                break;
            case 2:
                addNN();
                break;
            case 3 :
                break;
        }
        if(x==3) break;
    }
}
//    private int id;
//    private String name;
//    private int date;
//    private int soluong;
//    private int dongia;
public static void addVN(){
    System.out.println("Nhap id :");
    int id=Integer.parseInt(sc.nextLine());
    System.out.println("Nhap name :");
    String name=sc.nextLine();
    System.out.println("Nhap date ");
    int date=Integer.parseInt(sc.nextLine());
    System.out.println("Nhap số lượng ");
    int soluong=Integer.parseInt(sc.nextLine());
    System.out.println("Nhập đơn giá ");
    int dongia=Integer.parseInt(sc.nextLine());
    System.out.println("Nhập định mức ");
    int dinhmuc=Integer.parseInt(sc.nextLine());
    list.add(new KhachHangVietNam(id,name,date,soluong,dongia,dinhmuc));
}
    public static void addNN(){
        System.out.println("Nhap id :");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap name :");
        String name=sc.nextLine();
        System.out.println("Nhap date ");
        int date=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap số lượng ");
        int soluong=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập đơn giá ");
        int dongia=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập quốc tịch ");
        String quoctich=sc.nextLine();
        list.add(new KhachHangNuocNgoai(id,name,date,soluong,dongia,quoctich));
}
public static void fix(){
    while (true) {
        System.out.println("SỬA ");
        System.out.println("1. Sửa theo id khách hàng VN");
        System.out.println("2. Sửa theo id khách hàng NN");
        System.out.println("3.Exit");
        System.out.println("Enter your choice ");
        int y = Integer.parseInt(sc.nextLine());
        switch (y) {
            case 1:
                fixVN();
                break;
            case 2:
                fixNN();
                break;
            case 3:
                break;
        }
        if(y==3) break;
    }
}
    public static void fixVN(){
        System.out.println("NHập id muốn sửa ");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("----Thong tin moi----");
        System.out.println("Nhap ten moi: ");
        String newname = sc.nextLine();
        System.out.println("Nhap ngày ra hoá đơn : ");
        int date = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap số lượng : ");
        int soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap đơn giá: ");
        int dongia = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập định mức ");
        int dinhmuc=Integer.parseInt(sc.nextLine());
        KhachHang khachhangVN = new KhachHangVietNam(id,newname,date,soluong,dongia,dinhmuc);
        int index = list.indexOf(id);
        list.set(index, khachhangVN);
    }
    public static void fixNN(){
        System.out.println("NHập id muốn sửa ");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("----Thong tin moi----");
        System.out.println("Nhap ten moi: ");
        String newname = sc.nextLine();
        System.out.println("Nhap ngày ra hoá đơn : ");
        int date = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap số lượng : ");
        int soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap đơn giá: ");
        int dongia = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập quốc tịch ");
        String quoctich=sc.nextLine();
        KhachHang khachhangNN = new KhachHangNuocNgoai(id,newname,date,soluong,dongia,quoctich);
        int index = list.indexOf(id);
        list.set(index, khachhangNN);
    }
    public static void xoaKhachHang() {
        System.out.println("Nhap id cần xoá : ");
        int id = sc.nextInt();
        for (KhachHang x: list) {
            if (x instanceof KhachHang && x.getName().equals(id)) {
                list.remove(x);
            }
        }
    }

    public static void findName() {
        System.out.println("Nhap name: ");
        String name = sc.nextLine();
        for (KhachHang x: list) {
            if (x instanceof KhachHangVietNam) {
                if (((KhachHangVietNam) x).getName().equals(name)) {
                    x.toString();
                }
            } else if (x instanceof KhachHangNuocNgoai) {
                if (((KhachHangNuocNgoai) x).getName().equals(name)) {
                    x.toString();
                }
            }
        }
    }
    public static void sort(){
        list.sort(Comparator.comparing(o->((KhachHang)o).getId()));
    }
    public static int binarySearch(ArrayList<KhachHang> array, int left, int right, int value) {
        int middle;
        while (array.get(left).getId() <= array.get(right).getId()) {
            middle = (left + right) / 2;
            if(array.get(middle).getId()==value){
                return middle;
            }
            if(array.get(middle).getId()> value){
                left = middle - 1;
            }else {
                right = middle +1;
            }
        }
        return -1;
    }
    public static void findID(){
    sort();
        System.out.println("Nhập id muốn tìm ");
        int id=Integer.parseInt(sc.nextLine());
        int mid= binarySearch(list,list.get(0).getId(),list.get(list.size()-1).getId(),id);
        System.out.println(list.get(mid));
    }

    public static void show(){
    for(KhachHang x:list){
        System.out.println(x);
    }
    }
}
