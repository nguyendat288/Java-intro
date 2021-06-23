package day13;

public class KhachHangVietNam extends KhachHang{
    private int dinhmuc;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    public KhachHangVietNam(int id, String name, int date, int soluong,int dongia, int dinhmuc) {
        super(id, name, date, soluong,dongia);
        this.dinhmuc = dinhmuc;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    @Override
    public String toString() {
        return super.toString()+ "KhachHangVietNam { " +
                " dinhmuc = " + dinhmuc +
                '}';
    }
}
