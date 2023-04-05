package day39_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {

       Map<Integer,String>okulMap=MapMethodDepo.örnekMapOluştur(); // Kalıcı olsun diye gidiyor methodu alıyor ve bizde kaydediyoruz


       okulMap.put(110,"Kerem-Umut-12-K-MF");
       System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106, 110]


        System.out.println(okulMap.values()); // [Ali-Cem-10-H-MF, Veli-Can-10-M-TM, Ali-Can-11-M-Söz, Ayşe-Cem-11-H-TM, Ayşe-Han-10-H-MF, Veli-Han-10-H-MF, Kerem-Umut-12-K-MF


         /*
          SORU : Verilen şubedeki (h) öğrencilerin sınıf, isim ve soyisimlerini
          başta sıra no olacak şekilde, her satırda bir ismin olacağı
          bir liste şeklinde yazdırın
           */

          // 1) önce value leri ayrı bir collection olarak kaydedelim
            // 2) her bir value yi split ile bir array a dönüştürelim
            // 3) array den sube yi kontrol edip
            // 4) eğer istenen şube ise öğrencinin sınıf, isim ve soyismini yazdıralım

           MapMethodDepo.şubeÖğrenciListesiYazdır(okulMap,"H"); // METHOD OLUŞTURDUK
    }

}
