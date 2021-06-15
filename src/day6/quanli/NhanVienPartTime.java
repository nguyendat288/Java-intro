package day6.quanli;

public class NhanVienPartTime extends NhanVien{
    private int timework;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(int timework) {
        this.timework = timework;
    }

    public NhanVienPartTime(int id, String name, int age, long phone, String mail, int timework) {
        super(id, name, age, phone, mail);
        this.timework = timework;
    }

    public int getTimework() {
        return timework;
    }

    public void setTimework(int timework) {
        this.timework = timework;
    }
    public long getLuong(){
        return this.timework*100000;
    }
    @Override
    public String toString() {
        return super.toString()+
                "NhanVienPartTime{" +
                "timework=" + timework +
                '}';
    }
}
