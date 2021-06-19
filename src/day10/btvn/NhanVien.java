package day10.btvn;

import day10.btvn.CanBo;

public class NhanVien extends CanBo {
    public NhanVien() {
    }

    public NhanVien(String name, int age, String gender, String address) {
        super(name, age, gender, address);
    }

    @Override
    public String toString() {
        return "NhanVien{"+super.toString()+"}";
    }
}
