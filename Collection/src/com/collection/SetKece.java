package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetKece {
    public static void main(String[] args){
        // menggunakan HashSet
        Set<String> kece = new HashSet<>();
        kece.add("aku"); // method add() ngge tambah objek ke set
        kece.add("i");
        kece.add("saya");
        kece.add("saya"); // tambah "bumi/earth" beberapa kali
        kece.add("saya");
        kece.add("kula"); // objek bisa terus ditambahkan ke set

        System.out.println("Daftar nama orang kece (ada " + kece.size() +") :");

        for (Iterator iterator = kece.iterator(); iterator.hasNext();){
            System.out.println("\t"+ iterator.next());
            // looping menggunakan interator

        }
    }
}
