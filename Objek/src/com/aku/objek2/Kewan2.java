package com.aku.objek2;

public class Kewan2 {

    String nama2;
    int berat;
    int tingkatKeimudan;

    public Kewan2(String namaKewan){
        nama2 = namaKewan;
    }

    public void beratKewan(int beratHewan){
        berat = beratHewan; //  beratHewan = parameter
        // bera = atribut class
    }
    public void tingkatKeimudan(int tingkatKeimudan){
        this.tingkatKeimudan = tingkatKeimudan;
    }

    public void CatakKewan(){
        System.out.println("Nama hewan: "+nama2);
        System.out.println("Berat hewan: "+berat+" ton");
        System.out.println("Tingkat keimudan: "+tingkatKeimudan+("%"));
        System.out.println();

    }
}
