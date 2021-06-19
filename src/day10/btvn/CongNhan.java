package day10.btvn;

public class CongNhan extends CanBo {

    private String bac;
    private String nganh;

    public CongNhan() {
    }

    public CongNhan(String bac, String nganh) {
        this.bac = bac;
        this.nganh = nganh;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public CongNhan(String name, int age, String gender, String address, String bac, String nganh) {
        super(name, age, gender, address);
        this.bac = bac;
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac='" + bac + '\'' +
                ", nganh='" + nganh + '\'' +super.toString()+
                '}';
    }
}
