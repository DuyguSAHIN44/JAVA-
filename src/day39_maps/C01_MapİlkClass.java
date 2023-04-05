package day39_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapİlkClass {
    public static void main(String[] args) {

        Map<Integer,String>okulMap=new HashMap<>();

        /*
        Bir map oluştururken ve element eklerken
        bilgilere sonradan erişimin mümkün olabilmesi için
        tüm elementlerin aynı bilgileri barındırdığından
        ve aynı sıralama ile element e eklendiğinden emin olmalıyız
         */

        okulMap.put(101,"Ali,Cem,10,H,MF");
        okulMap.put(102,"Veli,Can,10,M,TM");
        okulMap.put(103,"Ali,Can,11,M,Söz");
        okulMap.put(104,"Ayşe,Cem,11,H,TM");
        okulMap.put(105,"Ayşe,Han,10,H,MF");
        okulMap.put(106,"Veli,Han,10,H,MF");

        // Tüm elementleri yazınız
        System.out.println(okulMap); // {101=Ali,Cem,10,H,MF, 102=Veli,Can,10,M,TM, 103=Ali,Can,11,M,Söz, 104=Ayşe,Cem,11,H,TM, 105=Ayşe,Han,10,H,MF, 106=Veli,Han,10,H,MF}


        // kaç elementi var
        System.out.println(okulMap.size()); //6

        // tüm key leri yazdırdık
        System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106]


        // tüm value leri yazdırdık
        System.out.println(okulMap.values()); // [Ali,Cem,10,H,MF, Veli,Can,10,M,TM, Ali,Can,11,M,Söz, Ayşe,Cem,11,H,TM, Ayşe,Han,10,H,MF, Veli,Han,10,H,MF]

        // value collections için de kaç element vardır
        System.out.println(okulMap.values().size()); // 6




    }
}
