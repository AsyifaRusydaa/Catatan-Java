package com.aku.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {

    public static void main(String[] args){

        Scanner contohScanner = new Scanner(System.in);

        System.out.println("Program penjumlahannya sangat sederhana ya mbak");

        System.out.print("Masukkan angka pertama : ");
        int value = contohScanner.nextInt();

        System.out.print("Masukkan angka kedua : ");
        int anotherValue = contohScanner.nextInt();

        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " +result);
    }

}
