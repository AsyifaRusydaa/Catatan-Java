package com.collection;

public class Umur {
    private String nama;
    private int umur;

    public Umur(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public String toString(){
        return nama + " ("+ umur +" tahun)";
    }
}
