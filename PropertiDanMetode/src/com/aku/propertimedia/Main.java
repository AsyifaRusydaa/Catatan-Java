package com.aku.propertimedia;

public class Main {
    public static void main(String[] args){
        Kewan kucing = new Kewan(7);

        System.out.println("Ada seekor kucing yang bernama Owi");
        kucing.makan();
        kucing.jalan();
        kucing.lari();
        System.out.println("Umurnya "+kucing.umur);
        double oke= kucing.Berat() / ((kucing.Tinggi() * 0.01) * (kucing.Tinggi() * 0.01));
        System.out.println("Massa pada tubuh kuceng tersebut yaitu "+oke);
    }
}
