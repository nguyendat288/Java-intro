package day13.DienNuoc;

public class KhachHang {
    private int id;
    private String name;
    private int date;
    private int soluong;
    private int dongia;
    public KhachHang() {
    }

    public KhachHang(int id, String name, int date, int soluong,int dongia) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.soluong = soluong;
        this.dongia=dongia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", soluong=" + soluong +
                ", dongia=" + dongia +
                '}';
    }
}
