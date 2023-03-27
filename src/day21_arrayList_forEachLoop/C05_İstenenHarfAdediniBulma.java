package day21_arrayList_forEachLoop;

import java.util.Arrays;

public class C05_İstenenHarfAdediniBulma {
    public static void main(String[] args) {

        /*
        SORU 4: Kullanıcıdan bir cümle ve bir harf alın,
        harf cümlede kullanılmışsa kaç kere kullanıldığını yazdırın,
        kullanılmadıysa "harf cümlede kullanılmamış" yazdırın.
         */

        String cümle = "Yatin kalkin Java calişin";
        String istenenHarf = "a";

        String[] karakterler = cümle.split("");

        System.out.println(Arrays.toString(karakterler));

        // [Y, a, t, i, n,  , k, a, l, k, i, n,  , J, a, v, a,  , c, a, l, i, ş, i, n]

        int sayaç = 0;
        for (String each : karakterler
        ) {
            if (each.equalsIgnoreCase(istenenHarf)) {
                sayaç++;

            }
        }
        if (sayaç == 0) {
            System.out.println("İstenen harf cümlede kullanılmamış");
        } else {
            System.out.println("İstenen harf cümlede : " + sayaç + " adet kullanılmış");

            // İstenen harf cümlede : 5 adet kullanılmış
        }
    }

}
