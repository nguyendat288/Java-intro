package btvn1;

public class NvDaoTaoFullTime extends NhanVien{
    private String nganh;

    public NvDaoTaoFullTime(String name, int age, String gender, String phone, String email, int salary, int soTuyenSinh) {
    }

    public NvDaoTaoFullTime(String nganh) {
        this.nganh = nganh;
    }

    public NvDaoTaoFullTime(String name, int age, String gender, String phone, String email, int salary, String nganh) {
        super(name, age, gender, phone, email, salary);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    @Override
    public int doanhThu(){
        return this.getSalary()*8;
    }

    @Override
    public String toString() {
        return "NvDaoTaoFullTime{" +
                "nganh='" + nganh + '\'' + super.toString()+
                '}';
    }
}
