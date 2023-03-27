package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {

        // Bir stringi istediğimiz parçalara ayırmak için kullanılır

        String str ="Java candır can, bundan şüphesi olan var mı";

        // Soru: str kaç kelimedir?

        String[] kelimeler =str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, candır, can.]
        System.out.println("kelime sayısı :" + kelimeler.length);  //kelime sayısı :3

        //  Soru: en uzun kelime kaç harflidir?

        int enUzunKelimeLenght=kelimeler[0].length();
        for(int i=0; i<kelimeler.length; i++){

            if (kelimeler[i].length()>enUzunKelimeLenght){
                enUzunKelimeLenght=kelimeler[i].length();
            }

        }
        System.out.println("En Uzun Keliminin Karakter Sayısı : " + enUzunKelimeLenght );//En Uzun Keliminin Karakter Sayısı : 6



        // SORU: Bir stringi karakterlerine ayırmak istersek
        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));//[J, a, v, a,  , c, a, n, d, ı, r,  , c, a, n, ,,
                                                         // , b, u, n, d, a, n,  , ş, ü, p, h, e, s, i,  ,
                                                        // o, l, a, n,  , v, a, r,  , m, ı]

        System.out.println("Cümledeki karakter sayısı: " + karakterler.length);//Cümledeki karakter sayısı: 43

    }
}
