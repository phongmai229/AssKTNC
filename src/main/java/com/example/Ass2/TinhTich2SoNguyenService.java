package com.example.Ass2;


public class TinhTich2SoNguyenService {
    public int tinhTich(String a, String b){
        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
        } catch (Exception e) {
            throw new NumberFormatException("Giá trị nhập vào không hợp lệ");
        }
        return Integer.parseInt(a) *
                Integer.parseInt(b);
    }

}
