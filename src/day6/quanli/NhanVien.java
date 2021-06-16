package day6.quanli;

public class NhanVien {
    private int id;
    private String name;
    private int age;
    private long phone;
    private String mail;

    public NhanVien() {
    }

    public NhanVien(int id, String name, int age, long phone, String mail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.mail = mail;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return
                "{Nhân Viên : id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", mail='" + mail + '\''
                ;
    }
}
