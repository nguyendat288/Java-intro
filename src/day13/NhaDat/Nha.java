package day13.NhaDat;

public class Nha extends GiaoDich {
    private String diaChi;

    public Nha() {
    }

    public Nha(String diaChi) {
        this.diaChi = diaChi;
    }

    public Nha(int maGiaoDich, String ngayGiaoDich, double donGia, String loai, double dienTich, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, loai, dienTich);
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getThanhTien() {
        if (this.getLoai().equals("cao cap"))
            return this.getDienTich() * this.getDonGia();
        else
            return this.getDienTich() * this.getDonGia() * 0.9;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" +
                "diaChi='" + diaChi + '\'' +
                '}' + super.toString();
    }
}
