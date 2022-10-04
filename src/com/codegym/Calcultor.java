package com.codegym;

import java.security.NoSuchAlgorithmException;

public class Calcultor {
    public static void main(String[] args) {
        System.out.println("Tổng 2 số: " + Calcultor.sum(5,9));
        System.out.println("Hiệu 2 số: " + Calcultor.sub(5,9));
        System.out.println("Tích 2 số: " + Calcultor.mul(4,9));
        try {
            System.out.println("Thương 2 số: " + Calcultor.divide(10,5));
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) throws NoSuchAlgorithmException {
        if (b==0) {
            throw new NoSuchAlgorithmException();
        }
        return a/b;
    }
}
