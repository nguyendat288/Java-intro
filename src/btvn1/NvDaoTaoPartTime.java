package btvn1;

public class NvDaoTaoPartTime extends NhanVien{
    private String nganh;
    private int time;

    public NvDaoTaoPartTime(String nganh, int time) {
        this.nganh = nganh;
        this.time = time;
    }

    public NvDaoTaoPartTime(String name, int age, String gender, String phone, String email, int salary, String nganh, int time) {
        super(name, age, gender, phone, email, salary);
        this.nganh = nganh;
        this.time = time;
    }

    public NvDaoTaoPartTime() {
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    @Override
    public int doanhThu(){
        return this.getSalary()*this.getTime();
    }
    @Override
    public String toString() {
        return "NvDaoTaoPartTime{" +
                "nganh='" + nganh + '\'' +
                ", time=" + time + super.toString()+
                '}';
    }
}
