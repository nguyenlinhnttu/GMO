package model;

import java.util.List;

public interface SinhVienInterface {

    abstract SinhVien searchSV(int mssv);

    abstract List<SinhVien> getAllSV();

    abstract void addSinhVien(SinhVien obj);
}
