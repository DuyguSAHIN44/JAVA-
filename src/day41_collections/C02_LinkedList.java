package day41_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {

        /*
        List data türünde bir linkedList oluşturalım
         */

        List<String>harfler=new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        harfler.add("M");
        harfler.add("L");

        System.out.println(harfler); // [H, K, M, L]
        harfler.add("B");
        System.out.println(harfler); // [H, K, M, L, B]

        harfler.add(3,"T");
        System.out.println(harfler); // H, K, M, T, L, B]

        harfler.set(3,"R");
        System.out.println(harfler); // [H, K, M, R, L, B]

        System.out.println(harfler.size());


        List<String>semboller=new LinkedList<>();
        semboller.add("*");
        semboller.add("B");
        semboller.add("%");
        semboller.add("&");

        System.out.println(semboller); // [*, B, %, &]--- [H, K, M, R, L, B]
        System.out.println((harfler.retainAll(semboller))); // true ortak olmayan bütün harfleri sil dedik o da true dedi
        System.out.println(semboller);
        System.out.println(harfler); // [B] ortak elemanları yazdı diğerlerini sildi

        harfler.addAll(semboller);// harflere sembolleri ekledik
        System.out.println(harfler); // [B, *, B, %, &]

        System.out.println(harfler.removeAll(semboller)); //true ---harflerdeki sembollerin tümünü sil
        System.out.println(harfler); // [] sildi
    }

}
