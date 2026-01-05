package com.aku.accessmodifier.package3;

import org.omg.CORBA.SetOverrideType;

public class Main {
    public static void main(String[] args){
        System.out.println("public static int nilai=999; isinya ya "+Perhitungan.nilai);

        for (int x = 0;x<5;x++){
            new Perhitungan();
        }
        System.out.println("Sampai "+Perhitungan.nilai);
        System.out.println();
        System.out.println("getNilai memiliki nilai"+Perhitungan.getNilai());
        System.out.println();
        System.out.println("apalagi ya mbk");
    }
}
