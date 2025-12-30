package com.aku.operator;

public class OperatorUnary {
    public static void main(String[] args){

        System.out.println("Operator unary plus");
        int nilaiAwal= 5;
        int hasil= +nilaiAwal;
        System.out.println("Hasil +5 =" +hasil);
        System.out.println();

        System.out.println("Operator unary minus");
        int nilaiAwal2= 5;
        nilaiAwal2= -nilaiAwal2;
        System.out.println("Hasil -5 =" +nilaiAwal2);
        System.out.println();

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3= 5;
        nilaiAwal3++;
        System.out.println("Hasil 5++ =" +nilaiAwal3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- =" +nilaiAwal4);
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean kece = true;
        System.out.println("Nilai boolean = "+kece);
        System.out.println("Nilai boolean = "+!kece);
        System.out.println();
        boolean cupu = false;
        System.out.println("Nilai boolean = "+cupu);
        System.out.println("Nilai boolean = "+!cupu);



    }
}
