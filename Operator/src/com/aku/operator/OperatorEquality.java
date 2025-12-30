package com.aku.operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int EsTeh = 5;
        int EsJeruk = 4;
        boolean result;
        result = EsTeh == EsJeruk;

        System.out.println("Hasil dari 'EsTeh == EsJeruk, adalah " +result);
        System.out.println();

        System.out.println("Tidak sama dengan...");
        result = EsTeh != EsJeruk;
        System.out.println("Hasil dari 'EsTeh != Esjeruk' adalah " +result);
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = EsTeh > EsJeruk;
        System.out.println("Hasil 'EsTeh > EsJeruk' adalah " + result);
        System.out.println();
        
        System.out.println("Sama atau lebih besar dari..");
        result = EsTeh >= EsJeruk;
        System.out.println("Hasil 'EsTeh >= EsJeruk' adalah " + result);
        System.out.println();
        System.out.println("Kurang dari..");
        result = EsTeh < EsJeruk;
        System.out.println("Hasil 'EsTeh < EsJeruk' adalah " + result);
        System.out.println();
        System.out.println("Sama atau kurang dari dengan..");
        result = EsTeh <= EsJeruk;
        System.out.println("Hasil 'EsTeh <= EsJeruk' adalah " + result);
        System.out.println();


    }
}
