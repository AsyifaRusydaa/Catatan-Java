package com.aku.opp;

public class Jarwo extends Menungso{
    public Jarwo() {
        super(); // akan tetap memanggil constructor dari parent Class
        System.out.println("~~~construct Jarwo~~~");
    }

    public void mangan() { // overriding
        System.out.println("Baksonya satu kang ujang...");
    }

    public void ngombe(String es) { // overloading
        System.out.println("Minumnya " + es);
    }
}
