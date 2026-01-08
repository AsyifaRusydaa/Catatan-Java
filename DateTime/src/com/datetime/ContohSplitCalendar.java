package com.datetime;

import java.util.Calendar;

public class ContohSplitCalendar {
    public static void main(String[] args) {
        // wayahe tampil
        Calendar calendar = Calendar.getInstance();
        System.out.println("~~~Waktu sekarang adalah~~~");
        System.out.println(calendar.getTime());
        System.out.println();

        // wayahe tampil meneh
        System.out.println("Tanggal : "+calendar.get(Calendar.DATE));
        System.out.println("Bulan   : "+(calendar.get(Calendar.MONTH)+1)); // +1 ben kece
        System.out.println("Tahun   : "+calendar.get(Calendar.YEAR));
    }
}
