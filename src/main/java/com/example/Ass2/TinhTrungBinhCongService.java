package com.example.Ass2;

public class TinhTrungBinhCongService {
    public static double trungBinhCong(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new ArithmeticException("Array is empty or null");
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return (double)sum / numbers.length;
    }
}
