package com.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContohSimpleDateFormat {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateFormated = sdf.format(new Date());

        System.out.println("~~~Format tanggal default~~~");
        System.out.println(new Date());
        System.out.println();

        System.out.println("~~~Format tanggal dengan format~~~");
        System.out.println("\t"+dateFormated); // terlihat lebih rapi ya mbk
    }
}

