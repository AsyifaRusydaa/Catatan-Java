package com.aku.operator;

public class OperatorConditional {

    public static void main(String[] args) {
        int cupu = 4;
        int kece = 5;

        System.out.println("Conditional AND");
        boolean hasil1 = cupu == 3 && kece == 5;
        boolean hasil2 = cupu != 3 && kece == 5;

        System.out.println("Hasil AND saat cupu == 3 dan kece == 5 adalah " + hasil1);
        System.out.println("Hasil AND saat cupu != 3 dan kece == 5 adalah " + hasil2);
        System.out.println();
        System.out.println("Conditional OR");

        hasil1 = cupu == 3 || kece == 5;
        hasil2 = cupu != 3 || kece == 5;

        System.out.println("Hasil OR saat cupu == 3 dan kece == 5 adalah " + hasil1);
        System.out.println("Hasil OR pada cupu != 3 dan kece == 5 adalah " + hasil2);
        System.out.println();
    }
}
