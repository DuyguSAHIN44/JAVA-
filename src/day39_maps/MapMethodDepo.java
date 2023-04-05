package day39_maps;

import com.sun.source.tree.ReturnTree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {

    public static Map<Integer, String> örnekMapOluştur() { // bu method da bize MAP DÖNDÜRECEĞİ  için böyle yaptık yazdır deseydi Void yapardık

        Map<Integer, String> okulMap = new HashMap<>(); // Okul Map i

        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102, "Veli-Can-10-M-TM");
        okulMap.put(103, "Ali-Can-11-M-Söz");
        okulMap.put(104, "Ayşe-Cem-11-H-TM");
        okulMap.put(105, "Ayşe-Han-10-H-MF");
        okulMap.put(106, "Veli-Han-10-H-MF");

        return okulMap;
    }

         /*
          SORU : Verilen şubedeki (h) öğrencilerin sınıf, isim ve soyisimlerini
          başta sıra no olacak şekilde, her satırda bir ismin olacağı
          bir liste şeklinde yazdırın
           */

    public static void şubeÖğrenciListesiYazdır(Map<Integer, String> okulMap, String istenenŞube) { // method oluşturduk

        // 1) önce value leri ayrı bir collection olarak kaydedelim
        Collection<String> valueCollection = okulMap.values();

        // 2) her bir value yi split ile bir array a dönüştürelim
        System.out.println("-----------Şube Listesi-------------"); //GÜZELLEŞTİRDİK :))
        System.out.println("Sıra   Sınıf   İsim   Soyisim");        // GÜZELLEŞTİRDİK :))
        int sıraNo = 1; // Sıra old için bunu ekledik
        for (String eachValue : valueCollection
        ) {

            // Ali-Cem-10-H-MF

            String[] valueArr = eachValue.split("-"); // [Ali,Cem,10,H,MF] BÖYLE OLACAK


            // 3) array den sube yi kontrol edip (H)
            // 4) eğer istenen şube ise öğrencinin sınıf, isim ve soyismini yazdıralım
        //    if (valueArr[3].equalsIgnoreCase(istenenŞube)) {
                System.out.println(sıraNo + "- " + valueArr[2] + ", " + valueArr[0] + ", " + valueArr[1]);
                sıraNo++; // sıra noyu her defasında artıracak
            }

        }
    }

  //  public static Map<Integer, String> topluŞubeDeğiştirme(Map<Integer, String> okulMap, String eskiŞube, String yeniŞube) {
        // 1) önce key leri bir set olarak kaydedelim
      //  Set<Integer> okulKeySeti = okulMap.keySet();



            // 2) her bir value ların split ile array lere dönüştürelim
          //  String[] valueArr = okulMap.get(eachKey);

            // 3 Şube bilgisi eskiŞube olanları yeniŞube yapalım
            // 4) array deki bilgileri birleştirerek yeniden map a ekleyelim

            // 5)okulMap ın son halini return edeliM


       // }

 //   }

  //}
