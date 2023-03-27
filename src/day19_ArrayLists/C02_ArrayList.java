package day19_ArrayLists;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {
        /*
        Array List uzunluğu ESNEK bir liste dir.
        array alt yapısını kullanır ancak ekleme ve silme gibi
        işlemlerde daha avantajlıdır.
        arraylist in tek dejavantajı var
         elementleri tek tek eklemeniz gerekmesi

         */
        int[] arr={3,4};


        List<String>harfler=new ArrayList<>(); // BOŞ BİR LİST OLUŞTURDUK
        System.out.println(harfler); //[] boş array yapılır
        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler); // [s, l, a]  EKLEME SIRASINA GÖRE HARFLERİ EKLEDİ

    }
}
