package day35_interfaces;

import day32_inheritance_data_Typ_Kullanımı.CAvcıKuşlar;

public class C01_ChildOfI01 extends CAvcıKuşlar implements I01_Interface {
    @Override
    public void toplam() {

    }

    @Override
    public void çıkarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktöriyel() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(I01_Interface.str); // Java Candır

    }


    }
