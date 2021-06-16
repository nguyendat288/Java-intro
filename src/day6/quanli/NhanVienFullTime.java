package day6.quanli;

public class NhanVienFullTime extends NhanVien{
    private long tienthuong;
    private long tienphat;
    private long luongcung;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(long tienthuong, long tienphat, long luongcung) {
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public NhanVienFullTime(int id, String name, int age, long phone, String mail, long tienthuong, long tienphat, long luongcung) {
        super(id, name, age, phone, mail);
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }

    public long getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(long tienthuong) {
        this.tienthuong = tienthuong;
    }

    public long getTienphat() {
        return tienphat;
    }

    public void setTienphat(long tienphat) {
        this.tienphat = tienphat;
    }

    public long getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(long luongcung) {
        this.luongcung = luongcung;
    }
    public long getLuong(){
        return this.luongcung+this.tienthuong-this.tienphat;
    }

    @Override
    public String toString() {
        return super.toString()
                +" " +
                "tienthuong=" + tienthuong +
                ", tienphat=" + tienphat +
                ", luongcung=" + luongcung +
                " total= "+getLuong()+'}';
    }
}
