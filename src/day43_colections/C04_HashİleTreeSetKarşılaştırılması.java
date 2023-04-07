package day43_colections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_HashİleTreeSetKarşılaştırılması {
    public static void main(String[] args) {
        /*
        Bir HashSet ve bir TreeSet olluşturalım
        bir loop ile içlerine 150000 eleman ekleyelim
        işlem sürelerini kıyaslayalım
         */
        Random rnd=new Random();
        int sayı;
        Set<Integer>hashSet=new HashSet<>();
        Set<Integer>treeSet=new TreeSet<>();
        Long hashStart=System.currentTimeMillis();

        for (int i = 0; i < 150000; i++) {
            sayı=rnd.nextInt(1250000);
            hashSet.add(sayı);



        }
        Long hashFinish=System.currentTimeMillis();
        Long timeStart=System.currentTimeMillis();
        for (int i = 0; i < 150000; i++) {
            sayı=rnd.nextInt(1250000);
            treeSet.add(sayı);



        }
        Long tStart=System.currentTimeMillis();

    }
}
