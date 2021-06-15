package day6;

public class Run {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new TruongPhong();
        TruongPhong nv3 = new TruongPhong();
        nv1.getThuNhap();
        ((TruongPhong) nv2).getThuNhap2();
        nv3.getThuNhap2();
    }
}
