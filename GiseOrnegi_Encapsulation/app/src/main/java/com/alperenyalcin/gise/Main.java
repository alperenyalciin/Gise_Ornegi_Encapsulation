package com.alperenyalcin.gise;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen TC kimlik numaranızı giriniz: ");
        String tckn=scanner.nextLine();
        TCKN tcknNesne=new TCKN();
        tcknNesne.setTckn(tckn);


    }
}
