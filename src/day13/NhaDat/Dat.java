package day13.NhaDat;

public class Dat extends GiaoDich {
    public Dat() {
    }

    public Dat(int maGiaoDich, String ngayGiaoDich, double donGia, String loai, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, loai, dienTich);
    }

    public double getThanhTien() {
        if (this.getLoai().equals("A"))
            return this.getDienTich() * this.getDonGia() * 1.5;
        else
            return this.getDienTich() * this.getDonGia();
    }

}