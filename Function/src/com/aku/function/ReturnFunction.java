package com.aku.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 15; // funsi panjang
        double l = 8.5; // fungsi lebar
        double hasil = hitungLuas(p, l); //memanggil fungsi
        System.out.println("Hasilnya adalah "+hasil);
        System.out.println("Oke, sip");
    }
    //fungsi nilai balik
    public static double hitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return luas;
    }
}
