package day20_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C06_BaşkaClasstanÇalıştırma {
    public static void main(String[] args) {

        // C05 deki istenmeyenleri sil methodu buradan kullanalım

        List<String> ürünler=new ArrayList<>();

        ürünler.add("Nutella");
        ürünler.add("Çikolatalı Gofret");
        ürünler.add("Çokoprens");
        ürünler.add("Çokomel");

        String istenmeyenHarf="o";

        System.out.println(C05_İstenmeyeniSil.istenmeyenHarfİçerenleriSil(ürünler, istenmeyenHarf)); // [Nutella]

        System.out.println(C05_İstenmeyeniSil.istenmeyenHarfİçerenleriSil(ürünler,"a")); // [Çokoprens, Çokomel]


    }
}
