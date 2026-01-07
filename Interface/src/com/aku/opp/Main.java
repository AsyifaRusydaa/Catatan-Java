package com.aku.opp;

public class Main {
    public static void main(String[] args){

        Menungso menungso = new Menungso(); // manggil constructor Menungso

        System.out.println("Apakah menungso IS-A Objek -> " + (menungso instanceof Object));
        System.out.println("Apakah menungso IS-A Hewan -> " + (menungso instanceof Menungso));
        System.out.println("Apakah menungso IS-A Kucing -> " + (menungso instanceof Jarwo));
        System.out.println();

        // IS-A = termasuk jenis    true=yep/benar false=nope/salah

        Jarwo jarwo = new Jarwo(); // memanggil constructor menungsoo and jarwo`

        System.out.println("Apakah menungso IS-A Objek -> " + (jarwo instanceof Object));
        System.out.println("Apakah Jarwo IS-A Menungso -> " + (jarwo instanceof Menungso));
        System.out.println("Apakah Jarwo IS-A Jarwo -> " + (jarwo instanceof Jarwo));
        System.out.println();

        jarwo.mangan(); // bakso siji
        menungso.bayar(); // ngutang teros njir
        jarwo.ngombe("es teh");
    }
}
