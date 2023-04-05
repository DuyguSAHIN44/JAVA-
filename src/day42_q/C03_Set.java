package day42_q;

import java.util.Set;
import java.util.TreeSet;

public class C03_Set {
    public static void main(String[] args) {

        Set<String>öğrenciler=new TreeSet<>();
        // HashSet---hızlı
        // TreeSet--doğal sıralama
        /*
        SET unıc bakıyor
        Set index yapısını desteklemez
         */
        öğrenciler.add("Emre");
        öğrenciler.add("Kerem");
        öğrenciler.add("Duygu");
        öğrenciler.add("Burcu");

        System.out.println(öğrenciler); // [Burcu, Duygu, Emre, Kerem] DOĞAL SIRAMA YAPTI
        öğrenciler.add("Ahmet");
        System.out.println(öğrenciler); // [Ahmet, Burcu, Duygu, Emre, Kerem]

        öğrenciler.add("Kerem");
        System.out.println(öğrenciler); // [Ahmet, Burcu, Duygu, Emre, Kerem] YENİ KEREM EKLEYİNCE DİĞERİNİ SİLİP YERİNE YENİSİNİ EKLİYOR
        // ÜYELER BİRİCİK OLMALI


    }
}
