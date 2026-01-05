package com.aku.accessmodifier.package1;

public class KelasKece{
    private int memberKece1 =12;

    char memberKece2='A';
    double memberKece3=1.5;

    private int fungsiKece1(){
        return memberKece1;
    }
    int fungsiKece2(){
        // pangil private member & private fungsi
        int hasil = fungsiKece1()+ memberKece1;
        return hasil;
    }
    protected void methodKece(){
        System.out.println("Percobaan akses modifier");
    }
}
