package com.aku.array;

public class IndexOutOfBound {
    public static void main(String[] args){
        int[] contoh = {1, 2, 3, 4};
        System.out.println(contoh[0]);
        System.out.println(contoh[1]);
        System.out.println(contoh[2]);

        // Akses index ke 4
        System.out.println(contoh[3]);
    }
}
