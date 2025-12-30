package com.aku.operator;

public class OperatorAssignment {
    public static void main(String[] args) {
        System.out.println("Assignment operator penjumlah");
        int a = 1;
        a += 10; // a = a+10
        System.out.println("Nilai a = "+a);
        System.out.println();

        System.out.println("Assignment operator pengurangan");
        int b = 10;
        b -= 3; // b = b-3
        System.out.println("Nilai a = "+b);
        System.out.println();

        System.out.println("Assignment operator perkalian");
        int c = 20;
        c *= 2;
        System.out.println("Nilai a = "+ c);
        System.out.println();

        System.out.println("Assignment operator pembagian");
        int d = 15;
        d /= 3;
        System.out.println("Nilai a = "+ d);
        System.out.println();

        System.out.println("Assignment operator modulus");
        int e = 10;
        e %= 7;
        System.out.println("Nilai a = "+ e);
        System.out.println();

        int x = 24;
        int y = 8;
        int z = 2009;
        System.out.println("Saya lahir pada tanggal "+x);
        System.out.println("Pada bulan "+y);
        System.out.println("Di tahun "+z);

        int nilai = 62;
        System.out.println();
        System.out.println("Saat saya melihat nilai hasil ulangan saya bernilai "+nilai
                +". Saya merasa sedih dan mencoba mengeceknya kembali.");
        nilai = 100;
        System.out.println("Setelah saya cek kembali ternyata semua jawaban saya benar dan saya mendapatkan nilai "+nilai+".");
        System.out.println();
        System.out.println("Dan dari situ saya sadar kalau saya memang kece");
    }
}
