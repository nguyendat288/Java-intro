package btvn1;

public class NvTuyenSinh extends NhanVien{
    private int soTuyenSinh;

    public NvTuyenSinh() {
    }

    public NvTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }

    public NvTuyenSinh(String name, int age, String gender, String phone, String email, int salary, int soTuyenSinh) {
        super(name, age, gender, phone, email, salary);
        this.soTuyenSinh = soTuyenSinh;
    }

    public int getSoTuyenSinh() {
        return soTuyenSinh;
    }

    public void setSoTuyenSinh(int soTuyenSinh) {
        this.soTuyenSinh = soTuyenSinh;
    }
    @Override
public int doanhThu(){
        return this.getSalary()*8+this.soTuyenSinh*10;
}
    @Override
    public String toString() {
        return "NvTuyenSinh{" +
                "soTuyenSinh=" + soTuyenSinh + super.toString()+
                '}';
    }
}
