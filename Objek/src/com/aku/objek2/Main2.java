package com.aku.objek2;

public class Main2 {
    public static void main(String[] args){
        Kewan2 Mencawak = new Kewan2("Mencawak");
        Kewan2 Walang = new Kewan2("Walang Sangit");

        Mencawak.beratKewan(7);
        Mencawak.tingkatKeimudan(37);
        Mencawak.CatakKewan();

        Walang.beratKewan(13);
        Walang.tingkatKeimudan(86);
        Walang.CatakKewan();
    }
}
