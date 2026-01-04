package com.aku.function;

public class MethodOverloading {
    public static void main(String[] args){
        double p = 9;
        double l = 5.5;
        double HasilDouble = HitungLuas(p,l);
        System.out.println("Ini dia hasilnya yaitu "+ HasilDouble);
        System.out.println("dan");

        int panjang = 10;
        int lebar = 5;
        int HasilInt = HitungLuas(panjang, lebar);
        System.out.println("Ini dia hasilnya yaitu "+HasilInt);

    }

    public static double HitungLuas(double panjang, double lebar){
        double luas = panjang*lebar;
        return luas;
    }
    public static int HitungLuas(int panjang, int lebar) {
        int luas = panjang*lebar;
        return luas;
    }
}
