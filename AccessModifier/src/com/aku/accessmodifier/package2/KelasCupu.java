package com.aku.accessmodifier.package2;

import com.aku.accessmodifier.package1.KelasKece;

public class KelasCupu extends KelasKece {
    @Override
    protected void methodKece(){
       super.methodKece();
        System.out.println("Contoh pemanggilan protected dari package luar");
        System.out.println("Sangatlah kece ya mbk");
    }
}
