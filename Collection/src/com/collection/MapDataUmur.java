package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDataUmur {
    public static void main(String[] args){
        // buat map
        Map<String, Umur> dataUmur = new HashMap<>();

        // isi data
        dataUmur.put("1", new Umur("Ucup", 19));
        dataUmur.put("2", new Umur("Pongseng", 2));
        dataUmur.put("3", new Umur("Kucul", 120));
        dataUmur.put("4", new Umur("Pincung", 11));

        // nampilin data awal
        System.out.println("Data umur awal (jumlah orang: "+dataUmur.size()+")"); // +dataUmur.size() = jumlah data

        for (String key : dataUmur.keySet()) {
            System.out.println("\t"+key+": "+dataUmur.get(key));
        }
        System.out.println();

        // hapus data no 2
        dataUmur.remove("2");

        // tampilkan data akhir
        System.out.println("Data umur akhir (jumlah orang: "+ dataUmur.size()+")");
        for (Umur kece : dataUmur.values())
        System.out.println(kece);
    }
}
