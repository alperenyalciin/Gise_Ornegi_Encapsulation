package com.alperenyalcin.gise;


import java.util.Random;

public class TCKN {
    private String tckn;

    public TCKN() {
    }

    boolean kontrol = true;

    public void setTckn(String tckn) {
        if (tckn.length() == 11) {
            for (int i = 0; i < tckn.length(); i++) {
                char karakter = tckn.charAt(i);
                if (Character.isDigit(karakter)) {
                    kontrol = true;
                } else {
                    kontrol = false;
                    break;
                }
            }
            if (kontrol) {
                this.tckn = tckn;
                Random random = new Random();
                int giseNo = random.nextInt(100);
                System.out.println("Gişe No: " + giseNo);
            } else {
                System.out.println("lütfen bütün karakterleri rakam olarak giriniz");
            }
        } else {
            System.out.println("lütfen 11 haneli tc giriniz");
        }
    }
}
