package model;

import java.util.List;

public interface SinhVienDAO {

    public SinhVien searchSV(int mssv);

    public List<SinhVien> getAllSV();

    public void addSinhVien(SinhVien obj);
}
