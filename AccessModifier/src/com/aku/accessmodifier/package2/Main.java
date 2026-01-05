package com.aku.accessmodifier.package2;

import com.aku.accessmodifier.package1.KelasKece;

public class Main {
    public static void main(String[] args) {
        // contoh error
        KelasKece kelasKece = new KelasKece();
        //System.out.println(KelasKece.fungsiKece2());
        //System.out.println(KelasKece.memberKece2);
        //System.out.println(KelasKece.memberKece3);
        //System.out.println();

        KelasCupu kelasCupu= new KelasCupu();
        kelasCupu.methodKece();

    }
}
