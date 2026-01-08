package com.datetime;

import java.sql.SQLOutput;
import java.util.Calendar;

public class ContohSpesificCalendar {
    public static void main(String[] args) {
        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("~~~Waktu sekarang adalah~~~");
        System.out.println(calendar.getTime());
        System.out.println();

        // Menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("\t 15 hari yang lalu:");
        System.out.println(calendar.getTime());
        System.out.println();

        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("\t 4 bulan kemudian: ");
        System.out.println(calendar.getTime());
        System.out.println();

        // Menampilkan waktu 2 tahun yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("\t 2 tahun kemudian: ");
        System.out.println(calendar.getTime());
        System.out.println();
    }
}
