package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPanel {
    public static void main(String[] args) {
        // deklarasi array
        String[] heroes = new String[2];
        heroes[0] = "kece";
        heroes[1] = "cupu";
        //heroes[2] = "raperduli"; // error karena ukuran array 2
        // menggunakan ArrayList
        List<String> jajan = new ArrayList<>();
        jajan.add("batagor"); // method add() untuk menambahkan objek ke List
        jajan.add("pentol");
        jajan.add("macilor");
        jajan.add("risol"); // objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("List jajan awal:");
        // tampilkan List jajan awal
        for (int i = 0; i < jajan.size(); i++) { // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i +" = " + jajan.get(i)); // \t = spasi jarak awal
        }
        jajan.remove("pentol"); // remove() = hapus


        System.out.println("List jajan akhir:");
        // tampilkan List jajan akhir
        for (int i = 0; i < jajan.size(); i++) {
            System.out.println("\t index-"+ i +" = " + jajan.get(i));
        }
    }
}
