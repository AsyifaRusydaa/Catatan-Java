package com.aku.propertimedia;

public class Kewan {
    // properti/fields
    // inisiasi dengan nilai inisial
    double tinggi= 20;
    double berat= 3;

    int umur; // inisiasi melalui konstruksi

    Kewan(int umur){
        this.umur = umur;
    }

    void lari(){
        System.out.println("Mlayune cepet neni...");
    }
    void jalan(){
        System.out.println("Mlakune sui neni...");
    }
    void makan(){
        System.out.println("kalau makan nyam-nyam...");
    }

    double Tinggi(){
        return tinggi;
    }

    double Berat(){
        return berat;
    }

    int Umur(){
        return umur;
    }
}
