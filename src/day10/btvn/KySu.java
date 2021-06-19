package day10.btvn;

public class KySu extends CanBo{
    private String nganh;

    public KySu() {
    }

    public KySu(String nganh) {
        this.nganh = nganh;
    }

    public KySu(String name, int age, String gender, String address, String nganh) {
        super(name, age, gender, address);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganh='" + nganh + '\'' +super.toString()+
                '}';
    }
}
