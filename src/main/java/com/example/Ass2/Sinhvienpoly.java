package com.example.Ass2;

import java.util.ArrayList;
import java.util.List;

public class Sinhvienpoly {
    List<SinhVien> listSinhVien;

    public List<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public Sinhvienpoly() {
        listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("1", "Phong", "SD123", "JAVA4", "PH123"));
        listSinhVien.add(new SinhVien("2", "Huy", "SD123", "JAVA4", "PH222"));
    }

    public void add(String id, String hoTen, String maLop, String tenLop, String maSV) {
        if (id.length() < 3 || id.length() > 10) {
            return;
        }
        if (hoTen.length() < 3 || hoTen.length() > 10) {
            return;
        }
        if (maLop.length() < 3 || maLop.length() > 10) {
            return;
        }
        if (tenLop.length() < 3 || tenLop.length() > 10) {
            return;
        }
        for (char a : tenLop.toCharArray()
        ) {
            if (!Character.isLetterOrDigit(a) && !Character.isWhitespace(a)) {
                return;
            }
        }
        if (maSV.length() < 3 || maSV.length() > 10) {
            return;
        }
        listSinhVien.add(new SinhVien(id, hoTen, maLop, tenLop, maSV));
    }

    public boolean searchMaSV(String maSV) {
        for (SinhVien sinhVien : listSinhVien
        ) {
            if (sinhVien.getMaSV().equalsIgnoreCase(maSV)) {
                return true;
            }
        }
        return false;
    }
}
