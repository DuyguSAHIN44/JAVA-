package day19_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_get_set {
    public static void main(String[] args) {

        List<Integer> sayılar= new ArrayList<>(); //BOŞ LİSTE
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(2);

        System.out.println(sayılar); // [3, 5, 2]

        System.out.println(sayılar.get(0)); // 3 (GET : İSTENEN ELEMENTTEKİ İNDEX İ DÖNDÜRÜR / GETİRİR.

        // son index i yazdırın?

        System.out.println(sayılar.get(sayılar.size()-1)); //2


        // 2.elementini 12 yapın
        System.out.println(sayılar.set(2,12)); // 2 ( SET: VERİLEN İNDEX DEKİ ELEMENTİ UPDATE YAPAR (2,3) Esra yı Yaşar yapar
        System.out.println(sayılar); //[3, 5, 12]



        // 5 i 7 yapalım??

        System.out.println(sayılar.set(1,7)); //5
        System.out.println(sayılar); // [3, 7, 12]



    }
}
