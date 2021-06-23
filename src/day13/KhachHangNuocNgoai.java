package day13;

public class KhachHangNuocNgoai extends KhachHang {
    private String quoctich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String quoctich) {
        this.quoctich = quoctich;
    }

    public KhachHangNuocNgoai(int id, String name, int date, int soluong,int dongia, String quoctich) {
        super(id, name, date, soluong,dongia);
        this.quoctich = quoctich;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    @Override
    public String toString() {
        return super.toString()+ " KhachHangNuocNgoai { " +
                "quoctich='" + quoctich + '\'' +
                '}';
    }
}
