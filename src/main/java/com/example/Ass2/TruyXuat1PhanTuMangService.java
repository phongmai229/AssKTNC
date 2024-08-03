package com.example.Ass2;

public class TruyXuat1PhanTuMangService {

    public int truyXuat1PhanTu(int[] arr, int index1) {
        if (arr == null || index1 < 0 || index1 >= arr.length) {
            throw new IndexOutOfBoundsException("Invalid array or index");
        }
        return arr[index1];
    }

}
